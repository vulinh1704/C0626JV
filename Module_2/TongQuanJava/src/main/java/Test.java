public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Toán tử toán học: + - * / %
        int c = a + b;
        System.out.println(c);
        // Toán tử so sánh: > < <= >= == != trả về boolean
        System.out.println(a == b);
        // Toán tử gán: = += -= /= %=
        a = 11;
        b += 10; // <=> b = b + 20;
        System.out.println(b);
        a++;
        System.out.println(a);
    }
}
