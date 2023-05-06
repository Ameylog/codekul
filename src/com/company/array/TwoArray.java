package com.company.array;
import java.util.*;
  /*
        declaration for 2D array
        type[][] arrayName =new type[rows][column]
 */
public class TwoArray {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the rows and colm:-");
//        System.out.println("Enter the values of rows:- ");
//        int rows = sc.nextInt();
//        System.out.println("Enter the values of column:- ");
//        int col = sc.nextInt();
//
//        int[][] num = new int[rows][col];
//
//        //for input
//        System.out.println("Enter the arrays values:-");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                num[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter the value of x:");
//        int x = sc.nextInt();
//
//        // for output
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                if (num[i][j] == x) {
//                    System.out.print("index at " + "["+i+"]"+"["+j+ "]");
//                }
////                System.out.println("");
//            }
//        }
//        System.out.println("Element not found in list");


        /// array input
            int m=3 ;
        int [][]arr=new int[m][];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]=i;
                arr[i][j]=10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

       
    }
}
















