package array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,5,634};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            System.out.print(arr[i]+" ");
        }




        // 2 method for sort  array
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");



        }

    }
}
