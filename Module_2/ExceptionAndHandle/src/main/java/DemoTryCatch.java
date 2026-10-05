import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Start");
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("dang co loi");
        }
        System.out.println("End");
    }
}
