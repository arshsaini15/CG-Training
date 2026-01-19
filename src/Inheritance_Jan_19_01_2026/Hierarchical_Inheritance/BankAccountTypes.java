package Inheritance_Jan_19_01_2026.Hierarchical_Inheritance;

class BankAccount {
    protected int accountNumber;
    protected int balance;

    BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, int balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {

    FixedDepositAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {

        BankAccount a = new SavingsAccount(101, 5000, 4.5);
        BankAccount b = new CheckingAccount(102, 8000, 2000);
        BankAccount c = new FixedDepositAccount(103, 20000);

        ((SavingsAccount) a).displayAccountType();
        ((CheckingAccount) b).displayAccountType();
        ((FixedDepositAccount) c).displayAccountType();
    }
}
