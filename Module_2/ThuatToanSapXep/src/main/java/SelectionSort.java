import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 12, 5, 9};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // đưa từng phần tử về đúng vị trí của nó
            int indexOfMinElement = i;
            for (int j = i; j < arr.length; j++) { // Tìm ra VỊ TRÍ của phần tử nhỏ nhất
                if (arr[j] < arr[indexOfMinElement]) {
                    indexOfMinElement = j;
                }
            }
            // Đổi chỗ phần đầu tiên trong chưa được sắp xếp với phần tử nhỏ nhất (đôỉ chỗ arr[i] vs arr[indexOfMinElement])
            int temp = arr[i];
            arr[i] = arr[indexOfMinElement];
            arr[indexOfMinElement] = temp;
        }
    }
}
