package com.company.opert;

/**
 * Unary -->  expr++,expr--,++expr, --expr, +expr,-expr,~, !,
 *
 * ternary -->  ?, :
 */
public class UninaryTernary {

    public static void main(String[] args) {
        int i=10;
//
//        // unary  ++  --
//        System.out.println(i++); //10 (11)
//        System.out.println(++i);  //12
//        System.out.println(i--);  //12 (11)
//        System.out.println(--i);  //10
//
//        System.out.println(i++ + ++i); //22
//        System.out.println(i++ + i++); //21
//
//        // unary ~ and !
//        int a=10;
//        int b=-10;
//        boolean c= true;
//        System.out.println(~a);   // (-var)-1 = result
//                                  // (-10)-1 = -11
//        System.out.println(~b);   // (-(1-))-1 = 9
//        System.out.println(!c);

        // Ternary
        int p=5;
        int q=4;
        int min=(p<q)?p:q;
        System.out.println(min);


    }

}
