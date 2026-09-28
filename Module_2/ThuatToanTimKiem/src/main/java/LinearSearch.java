import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(0);
        list.add(10);
        list.add(-2);
        list.add(13);
        int index = linearSearch(list, -2);
        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static int linearSearch(ArrayList<Integer> list, int K) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == K) {
                return i;
            }
        }
        return -1;
    }
}
