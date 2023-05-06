package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);

        Collections.sort(list);
//        Collections.sort(list);   for reverse sort
        System.out.println(list);
    }
}
