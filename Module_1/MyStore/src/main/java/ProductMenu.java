import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {
    private ProductManager store = new ProductManager();

    void showMainMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====== Menu chính ======\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa sản phẩm\n" +
                    "3.Xóa sản phẩm\n" +
                    "4.Hiển thị tất cả\n" +
                    "5.Tìm theo tên\n" +
                    "0.Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showUpdateMenu();
                    break;
                case 3:
                    removeMenu();
                    break;
                case 4:
                    showAllMenu();
                    break;
                case 0:
                    System.out.println("Bye Bye!!!!");
                    break;
            }
        } while (choice != 0);
    }

    void showUpdateMenu() {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("===== Cập nhật sản phẩm =======");
        System.out.println("Nhập vị trí muốn sửa: ");
        int updateIndex = inputNumber.nextInt();
        System.out.println("Nhập ID: ");
        int id = inputNumber.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giá: ");
        double price = inputNumber.nextDouble();
        System.out.println("Nhập số lượng: ");
        int quantity = inputNumber.nextInt();
        Product newProduct = new Product(name, id, price, quantity);
        this.store.update(updateIndex, newProduct);
        System.out.println("Cập nhật thành công!");
    }

    void removeMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Xóa sản phẩm ======");
        System.out.println("Nhập vị trí muốn xóa: ");
        int removeIndex = input.nextInt();
        this.store.remove(removeIndex);
        System.out.println("Xóa thành công!");
    }

    void showAllMenu()  {
        System.out.println("===== Danh sách sản phẩm ====");
        ArrayList<Product> products = this.store.findAll();
        int index = 0;
        for (Product item : products) {
            System.out.println(index + ". " + "ID: " + item.getId() +
                    " - Name: " + item.getName());
            index++;
        }
    }

    void showAddMenu() {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("===== Thêm sản phẩm =======");
        System.out.println("Nhập ID: ");
        int id = inputNumber.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giá: ");
        double price = inputNumber.nextDouble();
        System.out.println("Nhập số lượng: ");
        int quantity = inputNumber.nextInt();
        Product newProduct = new Product(name, id, price, quantity);
        this.store.add(newProduct);
        System.out.println("Thêm thành công!");
    }
}

/*
Prompt 1: Copy các file (Thêm 1 dòng: "Tổng các file này lại cho tôi và sẵn sàng trả lời các cấu hỏi")
Prompt 2: Vẽ 1 sơ đồ về luồng hoạt đồng cho tôi (Có thể kèm chú thích trong ảnh) ~ nên sử dụng Claude Code.
Prompt 3: Hỏi đáp với AI những thắc để giúp bạn hiểu hơn(Ví dụ: Ý nghĩa sử dụng ArraList trong ProductManager)

Hoàn thiện CRUD, bổ sung các tính năng:
 + Hiển thị chi tiết sản phẩm.
 + Tìm kiếm theo khoảng giá.
 + Tìm kiếm theo tên gần đúng.
*/