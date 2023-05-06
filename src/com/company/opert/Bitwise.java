package com.company.opert;

/**
 * Bitwise operator:- &,^,|
 */
public class Bitwise {
    public static void main(String[] args) {

        int a=5; int n=7;
        System.out.println((5<6)&(6>5));
        System.out.println("AND:-"+(a&n)); // return less value
        System.out.println("OR:-"+(a|n));  // return large value
         System.out.println("XOR:-"+(a^n));
        System.out.println("Complement:- "+(~a));
    }
}
