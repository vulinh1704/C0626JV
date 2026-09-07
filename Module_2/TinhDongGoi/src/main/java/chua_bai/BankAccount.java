package chua_bai;

public class BankAccount {
    private double balance;
    private String owner;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount can't be negative");
            return;
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount can't be negative");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Amount can't be greater than balance");
            return;
        }
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }
}
