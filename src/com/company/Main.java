package com.company;

import com.company.string.Strings;

import java.util.Scanner;

//import java.lang.Math;
public class Main {

//    public static void add(int m,int n){
//        int add = m+ n;
//        System.out.println(add);
//    }
    public static void main(Strings[] args) {
        // write your code here
//        System.out.println("Hello World");
//        System.out.print("Hello World");
//

//        ###  Variable ####
//        String name="Amey";
//        int age=30;
//        String neighbours ="Akku";
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(neighbours);

//        ### datatype ###
//         # Primitive type
//        byte - 1; [-128 to 127]
//        short -2;
//        int-4;
//        long-8;
//        float -4;
//        double -8;
//        char- 2;
//        boolean -1;
//
//         byte age=30;
//         int phone= 123456789;
//         long phone2 = 123245678900000L;
//         float age2=30.5F;
//         double age3=152.455D;
//         char rohit='h';
//         boolean isAdult =false;
//        System.out.println(age);
//        System.out.println(phone);
//        System.out.println(phone2);
//        System.out.println(age2);
//        System.out.println(age3);
//        System.out.println(rohit);
//        System.out.println(isAdult);

//        ### Non primitive types
//        #// string     // are immutable
//         String name="Amey Shende";
//         System.out.println(name.length());
//         String friend = new String("Luua");
//         System.out.println(friend);

        //         /// concatenate
        //           String name="amey";
        //           String name1="shende";
        //           String name2=name + " and " + name1;
        //        System.out.println(name2);

        /// replace
        //        String name= "Amay";
        //        String name2= name.replace('a','b');
        //        System.out.println(name2);
        //        System.out.println(name);

        //    ///Substring
        //        String name="Amey and Amol";
        //        System.out.println(name.substring(5,9));

//       #// Arrays
//        String name=new String("Amey");
//        System.out.println(name);
//             # method 1 for declar array
//        int[] marks=new int[3];
//        marks[0] = 91;
//        marks[1]= 93;
//        marks[2]=95;
//        System.out.println(marks[1]);
//
//              # method 2 for declar array
//        int[] marks={90,91,93,57};

//        for (int i = 0; i < marks.length; i++) {     // for accessing all element in array
//            System.out.println(marks[i]);
//        }

//        for (int i:marks) {          /// implement in for each loop
//            System.out.println(i);
//        }

//        System.out.println(marks.length);


//        ## Casting           // convert one data type to another data type
//            ### Implicit     // small data typr --> large data type
//        float price=100.00F;
//        int gst=18;
//        float finalPrice=price + gst;
//        System.out.println(finalPrice);

//             ### Explicit    // large data type --> small data type
//          int price = 100;
//          int gst= (int) 18.00F;
//          int finalPrice =price + gst;
//          System.out.println(finalPrice);

//        ### operator ###
//         ## Arithmetic  operator ##
//              int a=30;
//              int b=80;

        /// Addition operator
//
//            System.out.println(a+b);
//            System.out.println(b-a);
//            System.out.println(a*b);
//            System.out.println(b/a);
//            System.out.println(a%b);
//            a++;
//            System.out.println(a);
//            a--;
//            System.out.println(a);

        /// Assignment operator
//              a = b;
//              System.out.println(a);
//              a +=b;  /// a= a+b;
//              System.out.println(a);
//              a-=b;
//              System.out.println(a);
//              a*=b;
//              System.out.println(a);
//              a/=b;
//              System.out.println(a);

        /// Comparison/Relational  operator
//            int A=5;
//            int B=10;
//            System.out.println(A==B);
//            System.out.println(A!=B);
//            System.out.println(A>B);
//            System.out.println(A<B);
//            System.out.println(A>=B);
//            System.out.println(A<=B);

        /// Logical Operator
//            int A=0,B=1;
//
//    //      System.out.println((5>3) && (8>5));
//            System.out.println((5>2) && (6>8));
//            System.out.println((5>3)||(8>5));
//            System.out.println((5>3)||(4>6));
//            System.out.println(!(5==3));
//            System.out.println(!(5>3));


//        ### Math class ###
//         int p=10;
//         int q=20;
//        System.out.println( Math.max(p,q));
//
//        System.out.println(Math.min(p,q));
//
//        int randomNumber = (int)(Math.random()*100);
//        System.out.println(randomNumber);

//        ### Taking input ##
        //        Scanner sc=new Scanner(System.in);
        //        System.out.println("Enter the value of n: ");
        //        int n = sc.nextInt();
        //        System.out.println("Enter the value of c: ");
        //        float c= sc.nextFloat();
        //        System.out.println("Enter the name: ");
        //        String name=sc.next();

//        ### Conditional statement ###
//         int age=19;
//         if (age>18){
//             System.out.println("You are eligible for driving");
//         }else{
//             System.out.println("you are eligible for driving");
//         }


//        ### switch ###
//        int n=0;
//        switch(n){
//            case 1:
//                 System.out.println("Monday");
//                 break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thusday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("sunday");
//        }

//        ### break && Continue ###
//        int i;
//        for (i = 1; i <=20 ; i++) {
//           if (i%3==0){
//               continue;
//           }
//            System.out.println(i);
//        }
//
//            ## Break ##
//        int i;
//        for (i = 1; i <=20 ; i++) {
//                if (i==11){
//                    break;
//                }
//            System.out.println(i);
//        }

//        ##loop##
        // for loop
//        for (int i = 1; i <10 ; i++) {
//            System.out.println(i);
//        }
//            // while each loop
//        int i=1;
//        while(i<=20){
//            System.out.println(i);
//            i++;
//        }

        /// Do while
//       int i=1;
//       do {
//           System.out.println(i);
//           i++;
//
//       }while (i<5);

        // try catch
//        int[] marks={99,97,95};
//        try {
//            System.out.println(marks[3]);
//        }catch (Exception exception){
//            System.out.println("An exception for caught while accessing an index the 'marks' array" );
//
//            System.out.println("We tried to print marks & an excetion must have accurred with index >=3");
//
//        }
//


//         int m=10;
//         int n=20;
//         add(m,n);

        // mini project
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber=0;
        do{
            System.out.println("Guess my number (1-100):");
            userNumber=sc.nextInt();

            if(userNumber==myNumber){
                System.out.println("WOOHOO . .  CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("Your number is soo small");

            }else{
                System.out.println("Your number is too large");

            }

        }while(userNumber>=0);
        System.out.println("My Number was: ");
        System.out.println(myNumber);


    }
}
