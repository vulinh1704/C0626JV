public class Bai_4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        // 12 - 1 -> gặp số nào a và b chia hết -> UCLN
        int min = Math.min(a, b); // lấy ra sô nhỏ hơn
        int UCLN = min;
        for (int i = 12; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                UCLN = i;
                break;
            }
        }
        System.out.println("a/b = " + a / UCLN + "/" + b / UCLN);
    }
}


