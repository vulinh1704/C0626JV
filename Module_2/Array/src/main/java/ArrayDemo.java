import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        int number_01 = 1;
        int number_02 = 3;
        int number_03 = 4;
        // 10 số nữa => khởi tạo 10 biến => dữ liệu tách rời khó khăn trong việc xử lý
        // Cấu trúc mảng: là cấu trúc cho phép lưu trữ 1 tập hợp các giá trị liên quan đến nhau
        int[] numbers = {3, 10, 4, 2, 8};
        // chỉ số(index) 0   1  2  3  4

        // length: số lượng phần tử có trong mảng
        System.out.println("Length of array: " + numbers.length);
        // Phẩn tử: Các gíá trị trong mảng
        System.out.println("First element of array: " + numbers[0]);
        System.out.println("Last element of array: " + numbers[numbers.length - 1]);
        // Duyêt mảng: fori, for-each
        System.out.println("Elements in array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Elements in array by for-each loop: ");
        for (int element : numbers) {
            System.out.println(element);
        }
         */
        /*
         Mảng trong Java là mảng tĩnh (cố định length)
         => Không hỗ trợ các hàm có CRUD (Thêm, sửa, xóa, tìm kiếm)
         => Muốn có thì tự xây dựng hoặc sử dụng Collection ArrayList (Thành phần xây dựng
         sẵn để người dùng thao tác mảng dễ dàng và linh hoạt hơn)
         */

        int[] numbers = new int[10];
        /* Các phần trong mảng nếu khai báo như trên sẽ có giá trị mặc định tương
        ứng với kiểu dữ liệu: int: 0, double: 0.0, String: null, boolean: false,...
         */
        System.out.println("Elements in numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
