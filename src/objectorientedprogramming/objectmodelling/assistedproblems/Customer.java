package objectorientedprogramming.objectmodelling.assistedproblems;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened account in " + bankName);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("SBI Bank");
        Customer c = new Customer("Varsha", 2500);

        bank.openAccount(c);
        c.viewBalance();
    }
}

