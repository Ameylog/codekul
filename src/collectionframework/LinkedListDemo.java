package collectionframework;
/**
 *  Maintain :;- duplicate element and insertion order
 *
 *
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
//        list.add(2,45);

        System.out.println(list);

        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        System.out.println(list2);

        System.out.println(list.contains(list2));

        list.addFirst(12);
        list.addLast(70);

        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list);


        Iterator<Integer>iterator= list.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
