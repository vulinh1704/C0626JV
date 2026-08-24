public class MethodDemo {
    public static void main(String[] args) {
        showHello(); // gọi phương thức
        int avg = getAvg(4, 6);
        // 4 và 6 là đối số là các giá trị thực sự truyền vào
        System.out.println(avg);
        int avg_02 = getAvg(8, 12);
        System.out.println(avg_02);
    }

    // Khởi tạo 1 phương thức (method) in ra 10 chữ Hello
    public static void showHello() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }
    }

    // Khởi tạo 1 phương thức nhận 2 số nguyên và trả về trung bình 2 số đó
    public static int getAvg(int a, int b) {
        int sum = a + b;
        return sum / 2;
        // giá trị trả về phải đúng kiểu dữ liệu quy định bên trên
    }
    // a và b: các tham số đại diện cho các giá trị có thể truyền vào phương thức.
}
