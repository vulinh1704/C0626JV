package ly_thuyet;

import java.util.Scanner;

// phím tắt: fori + tab
// Ctrl + ALt + L: sắp xếp code cho đẹp
public class LoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt(); // 3
        int count = 0;
        int temp = number; // 3
        System.out.println("20 boi so dau tien cua " + number);
        while (count <= 20) {
            System.out.println(temp); // 3 6 9
            temp = temp + number; // temp = 6 + 3 = 9
            count++;
        }

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        */

        /*
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        */

       /*
       do {
          <khoi_lenh_thuc_thi>;
       } while(<dieu_kien_lap>)

       Vòng lặp do while sẽ chạy khi <dieu_kien_lap> = true
       Vòng lặp do while <dieu_kien_lap> lần đầu dù đúng hay sai cũng đều thực thi khối lệnh
        int i = 10;
        do {
            System.out.println("i = " + i);
        } while (i < 5);
        */


        /*
        Khi gặp từ khóa break vòng lặp ngay lập tức dừng lại.

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        */

        // Khi gặp từ khóa continue, sẽ bỏ qua lượt lặp hiện tại và chuyển đến lượt tiếp theo.
        /*
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
         */
    }
}
