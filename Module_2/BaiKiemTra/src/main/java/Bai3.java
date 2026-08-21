import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        String str = "hoc lap trinh tai CodeGym CodeGym Ninggggggg";
        String[] strings = str.split(" ");
        int max = 0;
        String result = "";
        for (String item : strings) {
            if (item.length() > max) {
               max = item.length();
               result = item;
            }
        }
        System.out.println("Từ xuất hiện nhiều nhất là: " + result);


//        Map<String, Integer> map = new HashMap<>();
//        for (String item : strings) {
//            map.put(item, item.length()); // hoc,3 - lap,3 - ...
//        }
//
//        // Tìm ra số lượng ký tự nhiều nhất của từ trong danh sách
//        Collection<Integer> values = map.values();
//        int max = 0;
//        for (Integer item : values) {
//            if (max < item) {
//                max = item;
//            }
//        }
//
//        Set<String> keys = map.keySet();
//        for(String item: keys) {
//            if(map.get(item) == max) {
//                System.out.println("Từ xuất hiện nhiều nhất là: " + item);
//                break;
//            }
//        }
    }
}
