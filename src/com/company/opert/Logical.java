package com.company.opert;

/** Logical --> && ,||,
 *
 * Biwise --> &,|
 *
 * The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
 *
 * The bitwise & operator always checks both conditions whether first condition is true or false.
 *
 */
public class Logical {

    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c=1;

        //##**Logical and */
        System.out.println(a<b&&a<c); //false and false =true
        System.out.println(a<b&a<c);  // false and false =true
        System.out.println(a<b&&a++<c); // false and false=false

        //## LOgical Or ///
        System.out.println(a<b||b<c);
        System.out.println(a<b|b<c);

//        int a=10;
//        int b=5;
//        int c=20;
//        System.out.println(a<b&&a++<c);      //false && true = false
//        System.out.println(a);              //10 because second condition is not checked
//        System.out.println(a<b&a++<c);     //false && true = false
//        System.out.println(a);            //11 because second condition is checked


    }
}
