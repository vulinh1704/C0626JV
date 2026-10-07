import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start");
        try {
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("dang co loi");
        } catch (InputMismatchException e) {
            System.out.println("Nhap loi");
        } catch (Exception e) {
            System.out.println("Loi");
        } finally {
            System.out.println("Run finally");
        }
        // => Nên làm bắt từ chi tiết ngoại lệ -> chung chung
        System.out.println("End");
    }
}
/*
 finally: là khối dù khối try chạy đúng hay sai cũng sẽ được thực thi

 connection - kêt nối bên thứ 3: database, aws, cloud, file,... (mất phí hoắc tốn tai nguyên)
 -> khối finally sẽ sử dụng để đóng các connection dù chương trình có ngoại lệ hay không
*/
