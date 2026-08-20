import java.util.Scanner;
// Ctr + chuột phải

public class InOutDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taọ 1 đối tượng từ class có sẵn để hỗ trợ cho việc nhập dữ liệu từ bàn phím
        System.out.println("Input your name: ");
        String text = input.nextLine(); // nextLine(): cho phép nhập chuỗi
        System.out.println("Your name is: ");
        System.out.println(text);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        System.out.println("number = " + number);
    }
}

/*
hiển thị dữ liệu: sout
nhập dữ liệu: sử dụng Scanner
*/
