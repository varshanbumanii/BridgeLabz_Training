package objectorientedprogramming.this_static_finalkeywords;

public class BankAccount {
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Account Number: " + acc.accountNumber);
        } else {
            System.out.println("Invalid account object");
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Varsha", 1001);
        BankAccount acc2 = new BankAccount("Akshayaa", 1002);

        acc1.displayAccountDetails(acc1);
        acc2.displayAccountDetails(acc2);

        BankAccount.getTotalAccounts();
    }

}
