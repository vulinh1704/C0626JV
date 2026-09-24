import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "Ning");
        map.put(1001, "Duong");
        map.put(1002, "Khang");
        map.put(1003, "Quynh"); // put chưa có key trong map -> Thêm 1 entry (1 cặp key value)

        // Lấy ra 1 value cụ thể dựa vào key
        System.out.println(map.get(1003));
        // Xóa
        // map.remove(1000);

        // put -> trong map đã có key => update
        map.put(1000, "Linh");
        // Duyệt map
        // Set là 1 cấu dữ liệu tượng tự ArrayList nhưng các phần tử phải là duy nhất
        Set<Integer> keys = map.keySet(); // lấy ra danh sách keys hứng vào set
        for (Integer key : keys) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
        // System.out.println(map);
    }
}
