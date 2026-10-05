public class Demo {
    String name;
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 4; i++) {
        String a = 1;
        => Lỗi cú pháp
        */

        /*
        int a = 1;
        int b = 0;
        System.out.println(a / b);
        System.out.println("End");
        => Runtime Error
         */

        int a = 10;
        int b = 0;
        System.out.println("Bat dau chia...");
        int result = a / b;          // ngoại lệ xảy ra ở đây
        System.out.println("Ket qua: " + result); // không bao giờ chạy tới đây
    }
}
