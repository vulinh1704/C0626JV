package ly_thuyet;

public class PhuongTien {
    void chay() {
        System.out.println("Phương tiện đang di chuyển");
    }

    boolean dung(int doPhanh) {
        // logic
        return true;
    }
}

class XeMay extends PhuongTien {
    @Override // annotation (chú thích): thể hiện GHI ĐÈ phương thức
    void chay() {
        System.out.println("Xe máy đang chi chuyển");
    }

    @Override
    public boolean dung(int doPhanh) {
        // đổi logic
        return false;
    }
}

/*
GHI DÈ phương thức:
+ là các phương thức xảy ra mối quan hệ kế thừa.
+ là các phương thức cùng tên, cùng kiểu dữ liệu trả về, cùng tham số truyền vào, KHÁC code Logic bên trong.
+ *Access Modifier của phươnng thức ở class con >= AM class cha
*/

class Test {
    public static void main(String[] args) {
        // Kiểu dữ liệu lớp cha, tham chiếu đến đối tượng lớp con
             PhuongTien pt = new XeMay();
        // kiểu khai báo        kiểu thực tế
        pt.chay(); // xác định hàm gọi đến dựa vào kiểu thực tế
    }
}

/*
Đa hình là 1 cơ chế cho phép một thực thế có thể thực hiện cùng 1 hành vi nhưng theo nhiều cách khác nhau.
+ Đa hình lúc biên dịch: Overload Method (Nạp chồng phương thức)
+ Đa hình lúc runtime: Override method (Ghi đè phương thức)
 */

