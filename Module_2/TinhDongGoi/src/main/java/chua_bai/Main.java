package chua_bai;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ning", 5);
        System.out.println("First: ");
        System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        bankAccount.deposit(-1);
        bankAccount.deposit(10);
        System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        bankAccount.withdraw(-1);
        bankAccount.withdraw(16);
        bankAccount.withdraw(1);
        System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
    }
}
