package controlflow;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

//        // square pattern
//        for (int i = 0; i <4; i++) {
//            for (int j = 0; j <5 ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }

//        System.out.println();
//        // left triangle
//        for (int i = 1; i <=4; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }

//        // right ward  tranagle
//        for (int i = 1; i <=4; i++) {
//            for (int j =1 ; j <=4-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }

//        System.out.println();
        // left number triangle
//        int num=1;
//        for (int i = 1; i <=4; i++) {
//            for (int j =1; j <=i ; j++) {
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println(" ");
//        }

        // pyramid pattern
//        int n=4;
//        for (int i = 1; i <=4; i++) {
//            // for spaces
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            // for printing
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <=i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        // Hollow pyramid
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N : ");
//        int n = sc.nextInt();
//        System.out.print("Enter Symbol : ");
//
//        char c = sc.next().charAt(0);
//
//        for (int i = 1; i <= n; i++) {
//
//            //for spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // printing
//            if (i == 1 || i == n)
//                for (int j = 1; j <= i * 2 - 1; j++) {
//                    System.out.print(c);
//                }
//            else {
//                for (int j = 1; j <= i * 2 - 1; j++) {
//                    if (j == 1 || j == i * 2 - 1)
//                        System.out.print(c);
//                    else
//
//                        System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }

        //  Rectangle
//        int r=3; int c=6;
//
//        for (int i =1; i <=r ; i++) {
//            for (int j = 1; j <=c ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // Hollow Rectangle
//        for (int i = 1; i <=r; i++) {
//            for (int j = 1; j <=c ; j++) {
//                if(i==1 || j==1 || i==r || j==c){
//                    System.out.print("*"+" ");
//                }
//                else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }

        //  Hollow square
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <= 4; j++) {
//                if (i == 1 || j == 1 || i == 4 || j == 4) {
//                    System.out.print("*" + " ");
//                }
//                else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
