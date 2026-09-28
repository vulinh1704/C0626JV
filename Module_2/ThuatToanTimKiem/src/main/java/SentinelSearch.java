import java.util.ArrayList;

public class SentinelSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(0);
        list.add(10);
        list.add(-2);
        list.add(13);
        int index = sentinelSearch(list, 1);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }


    public static int sentinelSearch(ArrayList<Integer> list, int K) {
        list.add(K);
        int lastIndex = list.size() - 1;
        int i = 0;
        while (list.get(i) != K) {
            i++;
            if(i == lastIndex) {
                return -1;
            }
        }
        return i;
    }
}
