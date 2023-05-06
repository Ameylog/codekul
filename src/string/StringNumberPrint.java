package string;

import java.util.Scanner;

/**
 * Declare a string (str = "aabbbccdee")
 * output :                 a2b3c2d1e2
 */
public class StringNumberPrint {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
        String str = "aabbbccdee";
////        System.out.println(str);
//        char a[] = str.toCharArray();
//        int count=0;
////        int [] temp=new int[str.length()];
//
//        for (int i=0;i<str.length();i++) {
//            for (int j = i+1; j <str.length() ; j++) {
//                if (a[i]==a[j]){
//                    count++;
//
//                }
//            }
//            System.out.println(count);
//
//
//   }}
        int freq[] = new int[26];

        for (int i=0;i<str.length();i++ ){
            freq[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0);
            {
                System.out.println((char)i+" "+freq[i]);
            }
        }

    }
}
