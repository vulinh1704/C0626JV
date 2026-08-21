public class Bai2 {
    public static void main(String[] args) {
        int h = 5;
        int totalOfChar = 1;
        for (int i = 1; i < h; i++) {
            totalOfChar = totalOfChar + 2;
        }
        System.out.println("Total of char in line: " + totalOfChar);

        int numberOfStar = 1;
        for (int i = 1; i <= h; i++) {
            int numberOfSpace = totalOfChar - numberOfStar;
            String line = "";
            for (int j = 1; j <= numberOfSpace / 2; j++) {
              line += " ";
            }
            for (int j = 1; j <= numberOfStar; j++) {
                line += "*";
            }
            for (int j = 1; j <= numberOfSpace / 2; j++) {
                line += " ";
            }
            System.out.println(line);
            numberOfStar += 2;
        }
    }
}
