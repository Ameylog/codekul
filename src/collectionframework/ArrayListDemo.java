package collectionframework;

import java.util.*;

/**
 * Internal architecture:-    IMP interview
 * Hashmap
 * Hashset
 * ArrayList
 * LinkedList
 */

/**  ArrayList
 * 1) ArrayList Store dublicate element.
 * 2) 10 size default.
 * 3)Dynamic Grow amd shrink.
 *
 * above 10 size increase 50% of 10
 *  slow as compare to Linked list.
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        // multiple ways to iterate list
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer :list) {
            System.out.println(integer);
        }

        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

       // multiple ways
        List<Integer>list1=new ArrayList<Integer>();

        List<Integer>list2= Arrays.asList(1,2,3,4,5);

        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer>list4=new ArrayList<>(List.of(1,2,3));

        List<Integer>list5=new ArrayList<>(){{add(10);add(20);}};

        List<Integer>list6=List.of(1,2,3,4,5);


        // for print

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
