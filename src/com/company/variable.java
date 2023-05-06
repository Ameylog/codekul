package com.company;

import com.company.string.Strings;

public class variable {


    public static void main(Strings[] args) {

//        System.out.println("Hello world");
//        String str = "Wel"+9+"co"+34+"me"+(10+10);
//        System.out.println(str);
//
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age: ");
//        age = sc.nextInt();
//        if (age > 21) {
//            System.out.println("You are eligible for marriage");
//        } else {
//            System.out.println("You are not eligible for marriage");
//        }
//
////      ## variable ##
//        String name = "Amol";
//        System.out.println(name);
//        int PRN =2877;
//        System.out.println(PRN);
//
//      ## data type ##
        // Primitive data types
//        byte age = 122;
//        short Bank_no = 32546;    // 5 number   store
//        int Aadhar = 1234678901;    //  10 number
//        long Aadhar2 = 1234567890111234685L;      //19   number
//        float weight = 55.503730f;    // can not say
//        double weight2 = 378.73689D;   // can not say size
//        char gender = 'M';
//        boolean hi = false;
//
//        System.out.println(age);
//        System.out.println(Bank_no);
//        System.out.println(Aadhar);
//        System.out.println(Aadhar2);
//        System.out.println(weight);
//        System.out.println(weight2);
//        System.out.println(gender);
//        System.out.println(hi);
//
        // non primitive data types
//        Integer mob = 1234444;
//        Long mob3 = 675843784383023L;
//        Boolean val = true;
//        Character val2 = 's';
//        Short no = 123;
//        Float dew = 25787.25678F;
//        Double Dew2 = 75273.47203D;
//        Byte so=32;
//        System.out.println(mob);

//        ## String ##
//        String st = " amey Shende";
//        System.out.println(st.length());
//        System.out.println(st.toUpperCase());
//        System.out.println(st.toLowerCase());
//        System.out.println(st.substring(5, 8));
//        System.out.println(st.subSequence(2, 7));
//        System.out.println(st.trim());
//        System.out.println(st.replace('e', 'p'));
//
//        String str1 = "Abcd";
//        String str2 = "efgh";
//        System.out.println(str1 + "" + str2);
//        System.out.println(str1.charAt(0));        // char at index
//
//
//        ### array ##

//        String[] name={"Amey","Amol","Rahuk","Amyur"};
//        System.out.println(name.length);
//        System.out.println(name[2]);
//        for (int i = 0; i < name.length ; i++) {
//            System.out.println(name[i]);
//        }

//        int[] marks={45,89,65,24,67};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(Arrays.stream(marks).min());
//
//
//
//        for (int i = 0; i <marks.length; i++) {
//               System.out.println(marks[i]);
//        }
////
//        ### casting ##
//        float price=72.90f;
//        int gst=18;
//        float fprice=price + gst;      // Implicit  means low to high
//        System.out.println(fprice);
//
//         int prs= (int) (price+gst);  // explicit means high to low
//        System.out.println(prs);
//        String s="Four";
//        String v= s+ gst;
//        System.out.println(v);

//        ## constant ##

//        final float pi=3.14f;
//        System.out.println(pi);

//       ### operator ###
        /// Arithmetic operator
//        int a = 12;
//        int b = 5;
//        System.out.println("Addition: " + (a + b));
//        System.out.println("Subtraction :" + (a - b));
//        System.out.println("multiple:" + (a * b));
//        System.out.println("Division:" + (a / b));
//        System.out.println("modulus:" + (a % b));   // 12/5 == remainder is 2
//        System.out.println("Floor operation:"+(a);

        /// Relational operator
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a<=b);
//        System.out.println(a>=b);
//
        /// assignment operator
//        System.out.println(a=b);
//        System.out.println(a+=b);
//        System.out.println(a-=b);
//        System.out.println(a*=b);
//        System.out.println(a/=b);

        // logical operator
//        int c=7;
//        int d=4;
//        System.out.println((a>b)&&(c>d));
//        System.out.println(((a>b)&&(c<d)));
//        System.out.println((a>b)||(c>d));
//        System.out.println((a>b)!=(c>d));

//        ## math function ##
//        System.out.println(Math.max(a,b));

//        ## Min function ##
//        System.out.println(Math.min(a,b));

//        ## Random ##
//        int random=(int) (Math.random()*100);
//        System.out.println(random);

//        ### scanner ##
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        System.out.println("Enter the value of a:");
//        float a=sc.nextFloat();
//        System.out.println("Enter the string: ");
//        String sr=sc.next();
//        System.out.println("Thank for response ");

//        ### Conditional ###
//        int age;
//        System.out.println("Enter the age: ");
//        Scanner sc=new Scanner(System.in);
//        age=sc.nextInt();
//        if (age>21){
//            System.out.println("Your are eligible for Marriage.");
//        }else{
//            System.out.println("Your are not eligible for marriage");
//        }

//        ### Switch ##

//        int n=1;
//        switch(n){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednday");
//                break;
//            case 4:
//                System.out.println("Thusaday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("Sunday");
//        }

//        ## break && continue ##
//        int i ;
//        for ( i = 1; i <=20; i++) {
//            if (i%3==0){
//                continue;
//
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i <=15 ; i++) {
//            if (i==11){
//                break;
//
//            }
//            System.out.println(i);
//        }

//        ### loop ##
            // for loop
//        for (int i = 0; i <18 ; i++) {
//            System.out.println(i);
//        }

        /// while loop
//        int i=1;
//        while (i<=15){
//            System.out.println(i);
//            i++;
//        }

        /// do while

//        int i=1;
//        do {
//            System.out.println(i);
//            i++;
//
//        }while (i<15);



    }

}
