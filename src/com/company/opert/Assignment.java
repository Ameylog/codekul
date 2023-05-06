package com.company.opert;

/**
 * Assignment operator -->   = ,+=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=,
 */
public class Assignment {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;

        x += 4;
        System.out.println(x);
        x -= 8;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x /= 2;
        System.out.println(x);
        x %= 3;
        System.out.println(x);
        x &= 5;
        System.out.println(x);
        x ^= 3;
        System.out.println(x);
        x |= 5;
        System.out.println(x);
        x <<= 4;
        System.out.println(x);
        x >>= 5;
        System.out.println(x);


    }
}
