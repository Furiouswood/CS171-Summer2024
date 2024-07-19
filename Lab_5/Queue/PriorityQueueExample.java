package Lab_5.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(5);
        priorityQueue.add(25);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(35);
        priorityQueue.add(45);
        priorityQueue.add(59);
        priorityQueue.add(55);

        // Process elements
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
