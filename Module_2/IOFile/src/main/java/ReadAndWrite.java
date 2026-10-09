import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        /*
        FileWriter fileWriter = new FileWriter("data.txt"); // Khai báo 1 đối tượng ghi dữ liệu vào data.txt
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Tăng tốc độ ghi với buffer
        bufferedWriter.write("Trương Đăng Vũ Linh\n");
        bufferedWriter.write("Khang đẹp trai\n");
        bufferedWriter.write("Quỳnh xinh gái");
        bufferedWriter.close();
        */
        FileReader fileReader = new FileReader("data.txt"); // Khai báo 1 đối tượng đọc dữ liệu vào data.txt
        BufferedReader bufferedReader = new BufferedReader(fileReader); // Tăng tốc độ đọc với buffer
        // readLine() có tác dụng đọc ra dòng nếu có data lấy ra dòng đó, nếu không có thì sẽ trả lại null
        while (true) {
            String line = bufferedReader.readLine();
            if(line == null) break;
            System.out.println(line);
        }
    }
}
