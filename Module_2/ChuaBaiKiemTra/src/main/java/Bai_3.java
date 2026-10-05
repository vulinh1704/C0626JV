public class Bai_3 {
    public static void main(String[] args) {
        String str = "hoc laplaplap trinh tai CodeGym";
        String[] arr = str.split(" "); // => [hoc, lap, trinh, tai, CodeGym];
        int maxChar = arr[0].length();
        for (String item : arr) {
            if (item.length() > maxChar) {
                maxChar = item.length();
            }
        }

        for(String item: arr) {
            if(item.length() == maxChar) {
                System.out.println("Tu dai nhat: " + item);
                break;
            }
        }
    }
}
