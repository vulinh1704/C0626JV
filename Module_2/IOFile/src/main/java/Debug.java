public class Debug {
    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    public static void main(String[] args) {
        int num_1 = 1;
        int num_2 = 2;
        System.out.println(sum(num_1, num_2));
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Hello");
        System.out.println("Hi");
    }
}
