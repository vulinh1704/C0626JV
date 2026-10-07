import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoThrows {

    public static void main(String[] args) {}

    public static void callTest() throws IOException {
        test();
    }

    public static void callTest2() {
        try {
            test();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void test() throws IOException {

    }
}

/* throws:
+ giúp có thể báo rằng các method có thể tung ra lỗi checked exception
+ được đặt sau tên phương thức
+ có thể throws nhiều
+ Khi có 1 hàm gọi đến hàm có throws thì buộc phải xử lý checked exception mà hàm được goi tung ra:
   + tiếp tục throws
   + Sử dụng khối try catch
 */
