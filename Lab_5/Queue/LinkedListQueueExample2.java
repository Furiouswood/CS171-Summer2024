package Lab_5.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample2 {
    public static void main(String[] args) {
        Queue<Integer> linkedListQueue = new LinkedList<>();

        // Add elements
        linkedListQueue.add(10);
        linkedListQueue.add(20);
        linkedListQueue.add(15);
        linkedListQueue.add(5);
        linkedListQueue.add(25);
        linkedListQueue.add(30);
        linkedListQueue.add(40);
        linkedListQueue.add(35);
        linkedListQueue.add(45);
        linkedListQueue.add(59);
        linkedListQueue.add(55);

        // Process elements
        while (!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.poll());
        }
    }
}
