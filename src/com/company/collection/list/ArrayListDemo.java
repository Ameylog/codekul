package com.company.collection.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList:- Size is variable
 * Arraylist store object
 * array list create in heap
 * Inert time complexity:- O(n)
 * Search in element arralist :- O(1)
 *
 * Method:-
 * # Add:- add element in list    list.add(element)
 * # Get:- value get from index    list.get(index)
 * # modify/add element in between :- list.add(index , element)  , list.set(index,element)
 * # iterate/operation:- list.remove(index), list.size(), Collections.sort(list)
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        // add element
        list.add(4);         // add(element)
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);

        System.out.println(list);

        // get element
        System.out.println(list.get(0));; // get(index)
        System.out.println(list.get(1));
        System.out.println( list.get(2));

        // add element in between list
        list.add(1,6);  // add(index,element)
        list.add(2,0);

        System.out.println(list);

        // set elememt
        list.set(2,3);   // set(index,element)
        list.set(1,1);
        System.out.println(list);

        // delete element
        list.remove(3);   // remove(index)
        System.out.println(list);

        // count all element
        System.out.println(list.size());   // size()

        // for loop in arraylist
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();

        // sorting in arraylist
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer>list2 =new ArrayList<Integer>();
        list2.add(4);
        list2.add(2);

        // addAll
        list.addAll(list2);
        System.out.println(list);

       // removeAll
        list.removeAll(list2);
        System.out.println(list);

       // clear          // clear all element
        list.clear();
        System.out.println(list);

        // ArrayList<String> str=new ArrayList<String>();
//         ArrayList<Float> flt=new ArrayList<Float>();
//         ArrayList<Double> doub=new ArrayList<Double>();
//         ArrayList<Short> sho=new ArrayList<Short>();
//         ArrayList<Boolean>bool =new ArrayList<Boolean>();
//         ArrayList<Byte> byt=new ArrayList<Byte>();
//



    }
}
