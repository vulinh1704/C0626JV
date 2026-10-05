public class Bai_5 {
    public static void main(String[] args) {
        int a = 13;
        String str = "";
        while (a != 0) {
            int du = a % 2;
            str += du;
            a = a / 2;
        }

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}

/*
13 / 2 = 6 dư 1
6  / 2 = 3 dư 0
3  / 2 = 1 dư 1
1  / 2 = 0 dư 1
=> 1101
 */
