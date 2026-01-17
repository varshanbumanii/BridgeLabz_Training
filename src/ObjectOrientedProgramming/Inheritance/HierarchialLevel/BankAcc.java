package objectorientedprogramming.Inheritance.HierarchialLevel;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type  : Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type      : Checking Account");
        System.out.println("Withdrawal Limit : " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockPeriod; // in years

    FixedDepositAccount(int accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Lock Period  : " + lockPeriod + " years");
    }
}

public class BankAcc {
    public static void main(String[] args) {

        BankAccount sa = new SavingsAccount(101, 50000, 4.5);
        BankAccount ca = new CheckingAccount(102, 30000, 10000);
        BankAccount fd = new FixedDepositAccount(103, 100000, 5);

        System.out.println("---- Savings Account ----");
        sa.displayDetails();
        ((SavingsAccount) sa).displayAccountType();

        System.out.println("\n---- Checking Account ----");
        ca.displayDetails();
        ((CheckingAccount) ca).displayAccountType();

        System.out.println("\n---- Fixed Deposit Account ----");
        fd.displayDetails();
        ((FixedDepositAccount) fd).displayAccountType();
    }
}

