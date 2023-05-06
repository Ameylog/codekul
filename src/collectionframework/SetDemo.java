package collectionframework;

import java.util.*;

/**
 *
 *  set doesn't maintain insertion order
 */

// set  Tree set not maintain insertion and duplicate but it sorted in ascending order
public class SetDemo {
    public static void main(String[] args) {


        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        System.out.println(set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(90);
        set2.add(60);
        set2.add(30);
        System.out.println(set2);

        System.out.println();
        Set<Integer> set3 =new TreeSet<>();
        set3.add(10);
        set3.add(90);
        set3.add(60);
        set3.add(30);
        System.out.println(set3);

    }
}
