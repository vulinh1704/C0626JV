package ly_thuyet;

import java.util.Scanner;
// Ctr + chuột phải

public class InOutDemo {
    public static void main(String[] args) {
        /*
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        // Taọ 1 đối tượng từ class có sẵn để hỗ trợ cho việc nhập dữ liệu từ bàn phím
        System.out.println("Input your name: ");
        String text = input.nextLine(); // nextLine(): cho phép nhập chuỗi
        System.out.println("Your name is: ");
        System.out.println(text);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        System.out.println("number = " + number);
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = input.nextInt(); // nhập xong + enter
        System.out.println("Your age is " + age);
        input.nextLine(); // "" + enter
        System.out.println("Input your name: ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
        */

        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = inputNumber.nextInt(); // nhập xong + enter
        System.out.println("Your age is " + age);
        System.out.println("Input your name: ");
        String name = inputString.nextLine();
        System.out.println("Your name is " + name);

    }
}

/*
hiển thị dữ liệu: sout
nhập dữ liệu: sử dụng Scanner
*/
