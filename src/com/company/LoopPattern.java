package com.company;

import com.company.string.Strings;

import java.util.Scanner;

public class LoopPattern {

    public static void main(Strings[] args){

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner((System.in));
        int n=sc.nextInt();

//        ####  1st patt  filled rectangle ####
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//        }

//        #### 2st patt  left ward half pyramid   ####
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println(" ");
//        }
//
//        int a=4;
//        int b=8;
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");


//      ##### 3 Hollow rectangle ####
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if (i==1 || j==1 || i==n || j==n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//

////        ### 4 reverse half leftward pyramid ##
//        for (int i = n; i >0 ; i--) {
//            for (int j = i; j >0 ; j--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        ### (inverted Half pyramid) Right ward half pyramid ### rotate by 180 degree
//        for (int i = 1; i <=n ; i++) {
//
//            //printing space
//            for (int j = 1; j <=n-i; j++) {
//
//                System.out.print(" ");
//            }
//            // print star
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//         ### 5 Printing number patter ###

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }

//        #### 6 inverted half pyramid with number  downward ##
//        for (int i = n; i >0 ; i--) {
//            for (int j = i; j >0 ; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }

//         ### 7 (inverted Half pyramid with numbers) Right ward half pyramid ### rotate by 180 degree

//        for (int i = 1; i <=n ; i++) {
//            //printing space
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            // printing number
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

//        ### 8 Floyd's triangle ###;
//        int num=1;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println(" ");
//        }

//        ### 9 0-1 triangle ###
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                int sum=i+j;
//                if (sum%2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("0");
//                }
//            }
//
//            System.out.println(" ");
//        }



        }

    }





