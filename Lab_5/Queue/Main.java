package Lab_5.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding items to the Queue
        queue.add("t1");
        queue.add("t2");
        queue.add("t3");

        // Printing the top item of the Queue
        System.out.println("Queue" + queue);
        // Printing the top item of the Queue
        System.out.println("Top of queue: " + queue.peek());

        // Removing the top item from the Queue
        System.out.println("Poll from queue: " + queue.poll());
        queue.add("t4");

        // Printing the top item of the Queue
        System.out.println("Queue" + queue);
    }

}
