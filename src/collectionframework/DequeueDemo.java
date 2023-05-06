package collectionframework;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {

    public static void main(String[] args) {

        Deque<Integer>deque=new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(40);
        deque.offer(60);

        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.element());
        System.out.println(deque.peekLast());
        System.out.println(deque.peekFirst());



    }
}
