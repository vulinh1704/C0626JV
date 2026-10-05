public class DemoUncheckedException {
    public static void main(String[] args) {
        /*
        Demo d = null;
        System.out.println(d.name);
        */
        int[] arr = {1, 3, 5};
        System.out.println(arr[5]);
        System.out.println("Hello World");
    }
}

// UnCheckedException: là các ngoại lệ xảy ra trong quá trình run time
// Các lỗi này chỉ có thể xử lý với try catch
