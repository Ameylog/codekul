package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);   // add() show exception when queue is full
        queue.offer(80);    // offer() if queue is full then  return null

        System.out.println(queue);

//       System.out.println(queue.peek());  // return top element in queue and  return exception when queue is empty
         System.out.println(queue.poll());   // return top element and return null when queue is empty

        System.out.println(queue.remove()); // remove element from queue
        System.out.println(queue);
    }
}
