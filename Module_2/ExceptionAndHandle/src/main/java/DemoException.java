import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoException {

    public static void main(String[] args) {
        test();
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("data");
        fr.read();
    }

    public static void test() throws RuntimeException {
        throw new RuntimeException("Test");
    }
}

// CheckedException: là các ngoại lệ xảy ra ngay ra trong quá trình biên dịch cần phải xử lý
// Để xử lý checked exception: tiếp tục throws, sử dụng try/catch
