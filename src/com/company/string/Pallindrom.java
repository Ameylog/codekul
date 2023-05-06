package com.company.string;
import java.util.Scanner;

/**
 * Pallidrom ->>  read from front and back same
 *     Ex-  aba  -->> aba     read both side same
 */
public class Pallindrom {

    // for number pallidrome
//    public static void main(String[] args) {
//        int n=454;
//        int r,sum=0,temp;
//        temp=n;
//
//        while(n>0){
//            r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if(temp==sum)
//            System.out.println("palindrome");
//        else
//            System.out.println("Is not palindrome");
//    }

    // for String and  number also
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or string:- ");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }
//        System.out.println(reverse);                 // upto this code String or number reverse

        if (original.equals(reverse))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");

    }

}



