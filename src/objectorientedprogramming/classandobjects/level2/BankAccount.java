package objectorientedprogramming.classandobjects.level2;

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Total Amount Deposited: "+balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawing Amount: "+amount);
        }
    }
    void display(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance after Withdrawal: "+balance);
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner input = new Scanner(System.in);
        bankAccount.accountHolder = input.nextLine();
        bankAccount.accountNumber = input.nextInt();
        bankAccount.balance = input.nextDouble();
        System.out.print("Enter amount to deposit: ");
        bankAccount.deposit(input.nextDouble());
        System.out.print("Enter amount to withdraw: ");
        bankAccount.withdraw(input.nextDouble());
        bankAccount.display();
        input.close();
    }
}
