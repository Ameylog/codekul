package com.company.sorting;

/**
 * Selection Sort-->  worst case O(n^2)
 * <p>
 * smallest element set to the starting position.
 * <p>
 * 7,8,3,1,2
 * 1st iteration -> 1,8,3,7,2
 * 2nd iteration -> 1,2,3,7,8
 */
public class SelectionSort {
    //for printing arr
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        // selction sort

        for (int i = 0; i <arr.length; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]> arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

        }
        PrintArray(arr);
    }
}

