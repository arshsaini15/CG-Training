package Jan_22_01_2026.AssistedProblems;

import java.util.ArrayList;
import java.util.List;

public class BankAndAccount {

    public static void main(String[] args) {

        Bank bank = new Bank("State Bank");

        Customer c1 = new Customer("Arsh");
        Customer c2 = new Customer("Riya");

        Account a1 = bank.openAccount(c1, 5000);
        Account a2 = bank.openAccount(c2, 10000);
        Account a3 = bank.openAccount(c1, 2000);

        c1.viewBalances();
        c2.viewBalances();
    }
}

class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);

        System.out.println("Account opened for " + customer.getName()
                + " in " + name + " with balance " + initialBalance);

        return account;
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("\nBalances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName()
                    + " | Balance: " + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
