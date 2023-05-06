package com.company.sorting;

/**
 * Buuble sort--- > worst case   O(n^2)
 *
 * pair wise comparison. i and i+1 element comparison.
 *
 * largest element set to the right side of array
 *
 * (n-1) array iteration for ascending
 * Given Array--> 7,8,3,1,2
 *
 * 1st iteration ->
 *     1st step-> 7,3,8,1,2
 *     2nd step-> 7,3,1,8,2
 *     3rd     -> 7,3,1,2,8
 *
 */
public class BubbleSort {

    public static void PrintArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};

        // bubble sort compare to i and i+1 element
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }PrintArray(arr);

    }


}
