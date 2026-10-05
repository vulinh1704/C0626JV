import java.util.Arrays;

public class InsertionSort {
    public static int a;
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 12, 5, 9};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // đưa các phần tử về đúng vị trí của chúng
            for (int j = i; j > 0; j--) { // Đưa 1 phần tử đang kiểm tra (phần tử ở i) về đúng vị trí của nó
                if (arr[j] < arr[j - 1]) {
                    // đôỉ chỗ
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
