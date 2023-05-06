package com.company.array;
//import com.company.string.Strings;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        int[] marks=new int[4];         //syntax
//        marks[0]=45;
//        marks[1]=75;
//        marks[2]=36;
//        marks[3]=67;
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        for (int i = 0; i < marks.length ; i++) {
//            System.out.println(marks[i]);
//        }

        //// Taking input values from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] size = new int[n];

        // for input
        for (int i = 0; i < n; i++) {
            size[i] = sc.nextInt();
        }
        // for output
        for (int i = 0; i < n; i++) {
            System.out.println(size[i]);
        }

        // Finding element in array as per user input
        System.out.println("Enter the value of x:-");
        int x = sc.nextInt();
        //output
        for (int i = 0; i < size.length; i++) {

            if (size[i] == x) {
                System.out.println("size at index" +" "+ i);
            }
        }
        System.out.println("element not found in list");
    }
}

