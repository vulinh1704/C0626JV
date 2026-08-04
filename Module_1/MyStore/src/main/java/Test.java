import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        /*
        Collection: Cấu trúc dữ liệu là những cấu trúc cho phép chứa nhiều giá trị
        Array, LinkedList, Map,....

        ArrayList: là 1 class được Java thiết kế sẵn dựa trên cấu trúc dữ liệu mảng,
        chúng cung cấp 1 bộ các method để thực hiện CRUD dữ liệu: add, get, remove, set,...
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); // thêm mới: add(<phan_tu_can_them>)
        numbers.add(-2);
        numbers.add(5);

        System.out.println("Element in 1 index: " + numbers.get(1)); // lấy ra 1 phần tử get(<vi_tri_muon_lay>)
        numbers.set(1, 4); // cập nhật: set(<vi_tri_cap_nhat>, <gia_tri_cap_nhat>)
        numbers.remove(0); // xóa: remove(<vi_tri_muon_xoa>)

        System.out.println("Elements: ");
        for(Integer item: numbers) {
            System.out.println(item);
        }
    }
}
