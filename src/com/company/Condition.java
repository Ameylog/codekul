package com.company;

import com.company.string.Strings;

import java.util.*;
public class Condition {

    public static void main(Strings[] args) {
        //odd or even

//        System.out.println("Enter the number: ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        if(n%2==0){
//            System.out.println("Number is even");
//        }else{
//            System.out.println("Number is Odd");
//

        System.out.println("enter the number a: ");
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        System.out.println("Enter the number b:");
        int b=sc.nextInt();

        if (a==b){
            System.out.println("a is equal to b");

        }else if (a>b){
            System.out.println("a is greater than b");

        }else{
            System.out.println("b is greater than a");
        }

    }



}
