import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>(); // Last In First Out (LIFO)
        stacks.push(-1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(5);
        stacks.push(10); // đẩy vào
//        System.out.println(stacks.pop()); // lấy ra => 10
//        System.out.println(stacks.pop()); // lấy ra => 5
//        System.out.println(stacks.pop()); // lấy ra => 3
//        System.out.println(stacks.pop()); // lấy ra
//        System.out.println(stacks.pop()); // lấy ra

        System.out.println(stacks.peek()); // IN ra phần tử trên cùng không xóa
        System.out.println(stacks.peek());
    }
}
