public class Bai_6 {
    public static void main(String[] args) {
        int number = 13;
        /*
        13 / 2 = 6 dư 1;
        6  / 2 = 3 dư 0;
        3  / 2 = 1 dư 1;
        1  / 2 = 0 dư 1;
        => Ghép phần dư và đảo lại: 1101
         */
        // Tìm danh sách các số dư ghép lại thành chuỗi bits
        String bits = "";
        while (number != 0) {
            bits += number % 2;
            number = number / 2;
        }

        // Đảo ngược ra kết quả
        String result = "";
        for (int i = bits.length() - 1; i >= 0; i--) {
            result += bits.charAt(i);
        }
        System.out.println(result);
    }
}
