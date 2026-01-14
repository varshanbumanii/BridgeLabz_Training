package ObjectOrientedProgramming.Constructors.AccessModifiers;

class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = 12345;
        sa.accountHolder = "Varsha";
        sa.setBalance(10000);

        sa.displayDetails();
    }
}

