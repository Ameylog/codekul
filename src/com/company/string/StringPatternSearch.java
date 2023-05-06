package com.company.string;
/**
 * String pattern
 * / find the pattern in given string
 *        // Str="geeks for geeks"
 *        // str2="geeks"
 *        // output:- 0 10
 */

public class StringPatternSearch {
    void patsearch(String txt,String pat) {
        int pos = txt.indexOf(pat);
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
        System.out.println("");
    }

     public static void main(String[] args) {
     StringPatternSearch obj=new StringPatternSearch();
     obj.patsearch("geeks for geeks","geeks");
     obj.patsearch("abcd bqtcd","cd");

      }



}
