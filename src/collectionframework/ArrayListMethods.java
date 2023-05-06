package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        System.out.println(list.contains(10));
        System.out.println(list.hashCode());
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());

        List<Integer>list2=new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(70);
        list2.add(80);

        System.out.println(list.equals(list2));
//        System.out.println(list.retainAll(list2));

//        list.clear();
//        System.out.println(list);

        List<List<Integer>>list4=new ArrayList<>();
        list4.add(list);
        list4.add(list2);

        System.out.println(list4);

        List<Object> lst=new ArrayList<>();
        lst.add("Hello");
        lst.add("Amey");
        lst.add(123);

        System.out.println(lst);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
