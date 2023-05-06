package com.company.array;

import java.util.Scanner;

/**
 * Odd and Even index of sum
 */
public class ArrayEvenIndexSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int oddSum = 0;

        System.out.println("Even index of sum:-");
        for (int i = 0; i < arr.length; i = i + 2) {
            sum = sum + arr[i];

        }
        System.out.println(sum);

        System.out.println("the odd index sum:-");
        for (int i = 1; i < arr.length;i=i+2 ) {
            oddSum = oddSum + arr[i];
        }
        System.out.println(oddSum);
    }
}
