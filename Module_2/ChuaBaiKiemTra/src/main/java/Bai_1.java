import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bai_1 {
    public static void main(String[] args) {
        int[] foodIds = {3, 1, 3, 2, 1, 3, 1};
        // Map: <food_id, so_lan>
        /*
        3 - 2
        1 - 2
        2 - 1
         */
        Map<Integer, Integer> foodMap = new HashMap<>();
        for (int item : foodIds) {
            if(!foodMap.containsKey(item)) {
                foodMap.put(item, 1);
            } else {
                int count = foodMap.get(item);
                count++;
                foodMap.put(item, count);
            }
        }
        System.out.println(foodMap);
        Set<Integer> ids = foodMap.keySet();
        int max = 0;
        for (Integer id : ids) {
            if(foodMap.get(id) > max) {
                max = foodMap.get(id);
            }
        }

        System.out.println("San pham xuat hien nhieu nhat: ");
        for (Integer id : ids) {
            if(foodMap.get(id) == max) {
                System.out.println(id + " xuat hien: " + foodMap.get(id));
            }
        }
    }
}
