package com.company.array;

import java.util.Scanner;

public class ArrayIntialization {

    public static void main(String[] args) {
//
//        int a[],b;     // in this case int a[] is array int b is variable
//        a=new int[3];
//        b=10;
        Scanner sc=new Scanner(System.in);
//        // input
//
//        for (int i = 0; i < 3; i++) {
//            a[i]=sc.nextInt();
//        }
//        //output
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//        System.out.println(b);

       // in int[] x,y; both x and y are integer array
        int[] x,y;
        x=new int[2];
        y=new int[2];

        for (int i = 0; i <2 ; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }

        for (int i = 0; i <x.length; i++) {
            System.out.println(x[i]);
            System.out.println(y[i]);
        }



    }
}
