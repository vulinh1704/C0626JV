import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(-3);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(13);
        int index = binarySearch(list, 13);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static int binarySearch(ArrayList<Integer> list, int K) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            int midElement = list.get(mid);
            if (midElement == K) {
                return mid;
            } else if (K > midElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
