package com.company.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set set=new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(null);   // only one null allow

//System.out.println(set);

//        Iterator three method -> hasnext() ,next(), remove()

//        hasnext()  ->return boolean value

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



        }
    }

