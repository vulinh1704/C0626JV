import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        int[] ids = {3, 1, 3, 2, 1, 3, 10, 10, 10};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ids.length; i++) {
            int key = ids[i];
            if (map.containsKey(key)) {
                int count = map.get(key);
                count++;
                map.put(key, count);
            } else {
                map.put(key, 1);
            }
        }

        // Tìm số lần xuất hiện nhiều nhât;
        int max = 0;
        Set<Integer> keys = map.keySet();
        for (int item : keys) {
            if (map.get(item) > max) {
                max = map.get(item);
            }
        }

        // Hiển thị
        System.out.println("Các sản phẩm bán chạy nhật");
        for (int item : keys) {
            if (map.get(item) == max) {
                System.out.println("Sản phẩm: " + item + " với số lần: " + max);
            }
        }
    }
}
