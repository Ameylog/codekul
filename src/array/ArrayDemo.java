package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
//
//        // int[] arr=new int[];            array syntax
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of values:- ");
//        int n=sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i <n; i++) {
//            arr[i]=sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        // sort an array
        int[] amey={ 1,4,6,2,7};
        Arrays.sort(amey);
        for (int i = 0; i <amey.length ; i++) {
            System.out.print(amey[i]+" ");
        }


    }
}
