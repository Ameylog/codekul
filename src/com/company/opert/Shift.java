package com.company.opert;

/** shift operator --> << ,>> ,>>>
 *
 * The Java left shift operator << is used to shift all of the bits in a
 * value to the left side of a specified number of times.
 *
 *  << :- multiple by 2 and power the no of bit
 *  >> :- divide by 2 and power the no of  bit
 */
public class Shift {
    public static void main(String[] args) {
        int i=5;
        int j=4;

        System.out.println(10<<2); // 10*2^2=40
        System.out.println(10<<3); // 10*2^3 =80

        System.out.println(10>>2); // 10/2^2=2
        System.out.println(10>>3); // 10/2^3=1

        System.out.println(20>>2);
        System.out.println(-20>>>2);  // for negative number change in parting bit(msb) to 0
//        System.out.println(i<<2);
//        System.out.println(i<<3);
//
//        System.out.println(i>>2);
//        System.out.println(i>>3);
    }
}
