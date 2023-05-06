package com.company.collection.list.linkedlist;

import java.util.LinkedList;

/**\
 * using collection frame work
 *
 * // by default add in last
 */
public class LinkedList2Demo {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();

        list.addFirst("a");      // add first
        list.addFirst("is");
        list.addFirst("this");

        list.addLast("list");     // add element in last
        System.out.println(list.size());   // size of linked list
        System.out.println(list);


        list.removeFirst();    // remove from start
        list.removeLast();      // remove from last
        list.remove(1);    // remove from index
        System.out.println(list);

        // travese
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
