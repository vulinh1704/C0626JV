public class StringMemory {
    public static void main(String[] args) {
        String str01 = "Hello"; // String literal
        String str02 = "Hello"; // String literal -> vào String pool kiểm tra xem có "Hello" hay chưa, nếu có thì dùng luôn địa chỉ đó
        String str03 = new String("Hello"); // String Object: đối tượng sinh ra bên heap sẽ ngoài pool
        String str04 = new String("Hello");
        System.out.println(str01 == str02); // true
        System.out.println(str03 == str04); // false
        System.out.println(str02 == str03); // false
    }
}
