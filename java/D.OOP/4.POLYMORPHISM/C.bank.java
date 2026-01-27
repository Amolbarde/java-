class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Interest calculation for general account");
    }

    void displayAccountType() {
        System.out.println("This is a Bank Account");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Account Interest: " + interest);
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account");
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest() {
        System.out.println("Current Account has no interest");
    }

    void displayAccountType() {
        System.out.println("This is a Current Account");
    }
}

public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("Akash", 10000);
        BankAccount acc2 = new CurrentAccount("Ravi", 15000);

        acc1.displayAccountType();
        acc1.calculateInterest();

        System.out.println();

        acc2.displayAccountType();
        acc2.calculateInterest();
    }
}

output::
This is a Savings Account
Savings Account Interest: 400.0

This is a Current Account
Current Account has no interest
C
