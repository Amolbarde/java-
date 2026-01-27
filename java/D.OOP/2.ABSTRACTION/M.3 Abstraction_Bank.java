abstract class Bank {
    abstract void interestRate();
    abstract void loanType();

    void bankInfo() {
        System.out.println("This is a bank.");
    }
}

class SBI extends Bank {
    void interestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }

    void loanType() {
        System.out.println("SBI offers Home Loan and Education Loan.");
    }
}

class HDFC extends Bank {
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7.2%");
    }

    void loanType() {
        System.out.println("HDFC offers Personal Loan and Business Loan.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        b1.bankInfo();
        b1.interestRate();
        b1.loanType();

        System.out.println();

        b2.bankInfo();
        b2.interestRate();
        b2.loanType();
    }
}

// output
// This is a bank.
// SBI Interest Rate: 6.5%
// SBI offers Home Loan and Education Loan.
// This is a bank.
// HDFC Interest Rate: 7.2%
// HDFC offers Personal Loan and Business Loan.

