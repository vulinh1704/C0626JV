import java.util.Scanner;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        System.out.println("Enter your email: ");
        while (true) {
            String email = input.nextLine();
            boolean isMatch = Pattern.matches(regex, email); // kiểm tra email có khớp với mẫu regex hay không
            if(isMatch) {
                System.out.println("Valid Email");
                break;
            } else {
                System.out.println("Invalid Email, pls input try again");
            }
        }
        System.out.println("End");
    }
}
// => Áp dụng validate dữ liệu vào bài quản lý.
