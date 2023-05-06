package com.company;

import com.company.string.Strings;

import java.util.Scanner;

public class function {

    // myName -->> firsh letter small and next is Capital letter ( camel case)
//    public static void myName(String name){
//        System.out.println(name);
//    }

//    public static void  sum(int a,int b){
//        int add = a+b;
//        System.out.println(add);
//    }

//    public static void product(int a,int b){
//             System.out.println(a*b);
//
//    }
    public static void printFactorial(int n){
        int fact=1;
        for (int i =n; i >0; i--) {
            fact=fact*i;

        }
        System.out.println(fact);
        return;
    }

    public static void main(Strings[] args){

        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//
////        myName();

//        int a=sc.nextInt();
//        int b=sc.nextInt();

//        sum(a,b);
//        product(a,b);
        printFactorial(6);
    }



}
