package array;


import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class ArrayDublicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 5, 7, 7};

//        List<Integer> list=new ArrayList<Integer>();
        Set<Integer> set=new HashSet<>();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
//                    if(!list.contains(arr[i])){   // for list
//                        list.add(arr[i]);
//                    }
                    if(!set.contains(arr[i])){    // for set
                        set.add(arr[i]);
                    }
                }

            }
        }
//        System.out.println(list);
        System.out.println(set);
    }
}

    

