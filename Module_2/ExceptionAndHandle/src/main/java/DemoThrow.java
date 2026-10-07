public class DemoThrow {

    public static void main(String[] args) {
        System.out.println("start");
        int a = 1;
        System.out.println(a);
        test();
        System.out.println("end");
    }

    public static void test() {
        throw new RuntimeException("My Runtime Exception");
    }
}
/*
 throw: là từ khóa giúp ném ra các ngoại lệ
 => thường sử dung khi muốn custom lỗi hệ thống => Xử lý với try catch.
 */
