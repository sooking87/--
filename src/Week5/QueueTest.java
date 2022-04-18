package Week5;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 10; i >= 0; i--) {
            queue.offer(i);
        }

        System.out.println(queue.toString());
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("Idx - " + (i + 1) + ": " + queue.poll() + " poll");
        }
    }
}
