package private_demo;

import public_demo.Teacher;

public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        System.out.println(account.balance); // lỗi
//        account.balance = 0;
//        account.resetForTesting();

//        Teacher teacher = new Teacher("Ning");
//        System.out.println(teacher.name);
//        teacher.showName();

        BankAccount account = new BankAccount(10);
        System.out.println(account.getBalance());
        account.setBalance(20);
    }
}
