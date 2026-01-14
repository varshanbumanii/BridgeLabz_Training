package ObjectOrientedProgramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: getters only
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount(101, "Varsha", 80000);
        BankAccount acc2 = new CurrentAccount(102, "Rahul", 150000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount acc : accounts) {
            System.out.println("---- Account Details ----");
            acc.displayDetails();

            double interest = acc.calculateInterest(); // Polymorphism
            System.out.println("Calculated Interest: " + interest);

            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(50000);
            System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());

            System.out.println();
        }
    }
}
