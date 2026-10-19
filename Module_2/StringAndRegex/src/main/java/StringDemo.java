import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        /*
        String str = "Hello World"; // String literal
        str = "Hi Linda"; // gán lại đối tượng mới
        String strObject = new String("Hello World"); // String Object
        String str2 = new String(new char[]{'V', 'u', ' ', 'L'});
        String newStr = str.toUpperCase();
        System.out.println(newStr);

        StringBuilder stringBuilder = new StringBuilder("Test String Builder");
        stringBuilder.append(" Test Append");
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer("Test String Buffer");
         */

        String str = "Hello World";
        System.out.println(str.equalsIgnoreCase("hello world"));
        System.out.println(str.equals("Hello world")); // kiểm tra có oiống nhau hay không
        System.out.println(str.contains("Wo")); // tìm có chứa hay không
        System.out.println(str.substring(0, 5)); // lấy chuũi con từ 0 -> 5
        System.out.println(str.charAt(4)); // lấy ra ký tự tại vị trí truyền vào
        System.out.println(str.length()); // lấy ra số ký tự

        // System.out.println(Arrays.toString(str.split(" ")));
        //System.out.println(str.strip());
        // System.out.println(str.replace("Hello", "World"));
        //System.out.println(str.isBlank());
        // System.out.println(str.startsWith("World"));
        //System.out.println(str.toLowerCase());
    }
}

/*
String là 1 kiểu dữ liệu đối tượng đại diện cho 1 tập ký tự và là final class (không cho phép kế thừa)
String thì thuộc Immutable => các hàm có sẵn của String thì sinh ra 1 chuỗi mới.
String được sử dụng phổ biến nhất.
Các phương thức thường sử dụng trong String Java:
split(String str): cắt chuỗi thàng mảng cho cách nhau bởi str
toLowerCase(): Sinh ra 1 chuỗi viết thường
startWith(String prefix): kiểm tra có bắt đầu bởi prefix không
isEmpty: kiểm tra cả dấu cách
isBlank: kiểm tra bỏ qua dấu cách
replace: Thay thế chuôĩ con bằng chuỗi mới
strip ~ trim: xóa các dấu cách ở 2 đâu.


StringBuilder, StringBuffer: là Mutable class
Hiệu năng: StringBuilder > StringBuffer (Phù hợp với đa luồng) > String
*/