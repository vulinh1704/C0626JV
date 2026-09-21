import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        Queue<String> queue = new LinkedList<>();
        queue.offer("Ning");
        queue.offer("Thai Duong");
        queue.offer("Nghia");
        queue.offer("Duong");
        queue.offer("Khang");
        System.out.println(queue.peek()); // In ra phần tử đầu tiên không xóa khỏi dãy
        System.out.println("Queue: ");
        System.out.println(queue.poll()); // lấy ra và xóa khỏi dãy
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        */
        /*
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(-1);
        priorityQueue.add(10);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
         */

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Ning");
        arrayDeque.add("Duong");
        arrayDeque.add("Khang");
        arrayDeque.addFirst("Tinh");
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
    }
}
