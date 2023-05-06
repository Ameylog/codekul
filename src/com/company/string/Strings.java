package com.company.string;

import java.util.*;

///// String are immutable

public class Strings {
    public static void main(String[] args) {
//        String name="Tony";
//        String fullname="Tony Stark";
//        System.out.println(name+" "+ fullname);   // concatenation
//        System.out.println(fullname.charAt(2)); // access the character from index

//        for (int i = 0; i <fullname.length() ; i++) {
//            System.out.println(fullname.charAt(i));
//        }


//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//
//        System.out.println(a+" "+b);
//        System.out.println(a.length());
//        System.out.println(b.length());


        /** compare string */
//        String name1="Tony";
//        String name2="Tony";

        // s1> s2; -->+ value
        // s1<s2;  ->> - value
        // s1=s2; --> 0

//      if (name1.compareTo(name2)==0){
//          System.out.println("String are equal");
//      }else{
//          System.out.println("String are not equal");
//      }

//        if (name1==name2){                             /**  ==  are check the references that is name1 and name2 are
//            System.out.println("Equal String");            two references are refer to same point or not */
//        }else{
//            System.out.println("Not Equal");
//        }

        /** substring */
//        String sent="Hello my name amey";
//        System.out.println(sent.substring(2,7));


        /** String builder */

        /**
        In string builder directly point to string builder object are stored
        we are directly changes in string builder, it is fast than string.
         */
//        StringBuilder sb=new StringBuilder("Tony");
//        System.out.println(sb);

      /** charAt */
//        System.out.println(sb.charAt(0));
//
////    Set char at index 0;
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
////
       /** insert */
//        sb.insert(2,'n');
//        System.out.println(sb);
//
        /** delete */
//        sb.delete(2,3);
//        System.out.println(sb);
//
        /** append */
//        sb.append('e');
//        System.out.println(sb);
//
       /** length */
//        System.out.println(sb.length());

        /** lower case and upper case  */
//        String a="PUne";
//        System.out.println(a.toLowerCase());
//        System.out.println(a.toUpperCase());

        /** check string  start with  ad end with */
//        String b="Amol";
//        System.out.println(b.startsWith("Am"));
//        System.out.println(b.endsWith("ol"));



        /////////////########### String Reverse ############/////////////
      StringBuffer sb=new StringBuffer("Hello");

        for (int i = 0; i <sb.length()/2 ; i++) {

            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);


        /** other way  for reverse string*/
//        String originalStr = "Hello";
//        String reversedStr = "";
//
//        for (int i = 0; i < originalStr.length(); i++) {
//            reversedStr = originalStr.charAt(i) + reversedStr;
//        }
//
//        System.out.println("Reversed string: "+ reversedStr);

    }
}
/**    No.	String	                                                                        StringBuffer
1)	The String class is immutable.	                                       1. The StringBuffer class is mutable.
 2)	String is slow and consumes more memory when we                        2. StringBuffer is fast and consumes less memory when we concatenate t strings.
 concatenate too many strings because every time it creates new instance.
 3)	String class overrides the equals() method of Object class.            3.StringBuffer class doesn't override the equals() method of Object class.
 So you can compare the contents of two strings by equals() method.
 4)	String class is slower while performing concatenation operation.	   4. StringBuffer class is faster while performing concatenation operation.
 5)	String class uses String constant pool.	                               5.StringBuffer uses Heap memory

 */