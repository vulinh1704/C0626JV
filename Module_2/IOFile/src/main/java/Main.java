import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // File file = new File("data.txt"); // đại diện file
        // file.createNewFile();
        // System.out.println("File is exist: " + file.exists());
        // System.out.println("Absolute path: " + file.getAbsolutePath());
        // System.out.println("Length of file: " + file.length());
        // File folder = new File("data_source/data.txt");
        // folder.createNewFile();
    }
}

/*
 Class File chỉ có thể chứa các hàm tương tác với File hoặc Folder,
 không thể đọc ghi DỮ LIỆU bên trong file
 Để đọc ghi được dữ liêu trong file sẽ cần sử dụng: FileReader, FileWriter
 -> Nên sử dụng BufferedReader, BufferedWriter để đọc ghi dữ liêu 1 cách hiệu quả.
 */
