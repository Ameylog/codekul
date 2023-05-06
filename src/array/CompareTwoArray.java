package array;

import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int arr3[]={1,2,3,4,5,6};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));
    }
}
