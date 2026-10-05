public class Bai_2 {
    public static void main(String[] args) {
        int h = 5;
        int numberOfStart = 1;
        int maxCharacter = 1; // lấy max số ký tự có ở 1 hàng
        for (int i = 1; i < h; i++) {
            maxCharacter += 2;
        }

        for (int i = 1; i <= h; i++) {
            int numberOfSpace = (maxCharacter - numberOfStart) / 2;
            for (int j = 1; j <= numberOfSpace; j++) { // số dấu cách bên trái
                System.out.print(" ");
            }
            for (int j = 1; j <= numberOfStart; j++) { // số *
                System.out.print("*");
            }
            for (int j = 1; j <= numberOfSpace; j++) { // số dấu cách bên phải
                System.out.print(" ");
            }
            System.out.println();
            numberOfStart = numberOfStart + 2;
        }
    }
}
