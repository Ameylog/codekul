//package com.company.array;
//
//import java.util.Scanner;
//
//
//public class CheckArraySorted {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//
//
//
//        boolean ans =issorted(a,n);
//        if(ans=true){
//            System.out.println("Sorted");
//        }else{
//            System.out.println("Unsorted");
//        }
//
//        public static boolean issorted(int a[],int n){
//            for (int i = 1; i <n ; i++) {
//                if (a[i] < a[i - 1]) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
//}