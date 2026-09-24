package thuc_hanh;

import java.util.Stack;

public class Bai_1 {
    public static void main(String[] args) {
        String code = "{abc([)]}";
        System.out.println(checkValid(code));
    }

    public static boolean checkValid(String code) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            char character = code.charAt(i); // lấy ra từng ký tự
            if (character == '{' || character == '[' || character == '(') {
                stack.push(character);
            } else if (character == '}' || character == ']' || character == ')') {
                if (stack.isEmpty()) return false;
                char openChar = stack.pop();
                if (character == '}' && openChar != '{') return false;
                if (character == ']' && openChar != '[') return false;
                if (character == ')' && openChar != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}
