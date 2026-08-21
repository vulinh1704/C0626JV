public class Bai_4 {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int min = Math.min(a, b);
        int UCLN = 1;
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                UCLN = i;
//            }
//        }

        for (int i = min; i >= 1 ; i--) {
            if (a % i == 0 && b % i == 0) {
                UCLN = i;
                break;
            }
        }
        int tuSo = a / UCLN;
        int mauSo = b / UCLN;
        System.out.println("Phân số tối giản là: " + tuSo + " / " + mauSo);
    }
}
