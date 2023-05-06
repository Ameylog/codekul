package com.company;


import com.company.string.Strings;

import java.util.Scanner;

public class advpattern {
    //    pattern type:- butter fly
    //    *      *
//        **    **
//        ***  ***
//        ********
//        ********
//        ***  ***
//        **    **
//        *      *

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        /// ### Butterfy pattern
//       // upper half
//        for (int i = 1; i <=n ; i++) {
////            1st part
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//        // spaces
//            int spaces=2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }
//        // lower half
//        for (int i = n; i>0  ; i--) {
////            1st part
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            // spaces
//            int spaces=2*(n-i);
//            for (int j = 1; j <=spaces ; j++) {
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }


//        ######  Solid Rohumbus #####

//        for (int i = 1; i <=n ; i++) {
//
//            // for spaces
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            // for star printing
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        ##### Number pyramid pattern #####
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5

//        int num=1;
//        for (int i = 1; i <=n ; i++) {
//            // for spaces
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            // print line
//            for (int j = 1; j <=i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }

//        #### palindrome  pattern   ####
//            1
//           212
//          32123
//         4321234
////
//         for (int i = 1; i <=n ; i++) {
//            // for spaces
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            // for 1st
//            for (int j =i; j>0; j--){
//                System.out.print(j);
//            }
//            //2nd
//           for (int j =2; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

//        #### Diamond Pattern ####
//               *
//              ***
//             *****
//            *******
//            *******
//             *****
//              ***
//               *
//       // for upper  half
//        for (int i = 1; i <= n; i++) {
//            // for spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // 1st print star
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <= i; j++) { // 2nd
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        // for lower half

//        for (int i = n; i > 0; i--) {
//            // for spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // for print star
//            // first half
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


    }

}
