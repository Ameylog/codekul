package controlflow;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        System.out.println();
        for (int i =10; i >=1 ; i--) {
            System.out.println(i);
        }

        // for each loop   (enhanced for loop)   // performance of for-each loop is greater than for loop and for each tha used in collection frame work
        int[] arr={10,20,30,40};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println();

        List<Integer> list= Arrays.asList(1,2 ,3 ,4);

        list.forEach(s->{
            System.out.println(s);
        });


    }

}
