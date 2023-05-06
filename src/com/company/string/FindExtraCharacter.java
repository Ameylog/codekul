package com.company.string;
import java.util.*;
public class FindExtraCharacter {
        // method 1 -- using sorting

//    char findExtra(String str,String str2){
//        char a1[]=str.toCharArray();
//        Arrays.sort(a1);
//
//        char a2[]=str2.toCharArray();
//        Arrays.sort(a2);
//
//        int n=str.length();
//        for (int i = 0; i <n ; i++) {
//            if(a1[i]!=a2[1])
//                return a2[i];
//            }
//        return a2[n];
//    }

    // method 2 --> counting
    char findExtra(String str,String str2){
        int count[] =new int[26];
        int n=str.length();
        for (int i = 0; i <n ; i++) {
            count[str.charAt(i)-'a']--;
            count[str2.charAt(i)-'a']++;

        }
        count[str2.charAt(n)-'a']++;
        for (int i = 0; i <26 ; i++)
            if(count[i]==1)
                return (char)(i+'a');
        return 0;
    }


    public static void main(String[] args) {
          FindExtraCharacter obj=new FindExtraCharacter();
         System.out.println(obj.findExtra("aabcbc","abbccba"));


    }
}
