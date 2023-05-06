package com.company.string;

import java.util.Arrays;

/**
 * Anagram --> means both String having present same character and number of
 * frequency is also same.
 * <p>
 * Ex-   s1="abaac"
 * s2="aacba"
 */
public class Anagram {

 /* // method 1   not so efficient time complexity  0(nlogn)
   boolean areAnagram(String s1,String s2){
    if(s1.length()!=s2.length()){
       return false;
    }
    char[] a1=s1.toCharArray();
    Arrays.sort(a1);
    s1=new String(a1);

    char[] a2=s2.toCharArray();
    Arrays.sort(a2);
    s2=new String(a2);

    return s1.equals(s2);
  }

  public static void main(String[] args) {
    Anagram obj=new Anagram();
    System.out.println(obj.areAnagram("abbac","babac"));
  }
*/

    // Method 2 efficient solution in linear manner O(n)
    static final int CHAR = 256;
    boolean isAnagram(String s1,String s2){

      // if String is non case sensitivity then convert both String in lower case or upper case the follow code
      String x=s1.toLowerCase();
      String y=s2.toLowerCase();

      // if String case sensitivity then follows code this code
      if(x.length()!=y.length()){
          return false;
      }
      int[] count=new int[CHAR];
      for (int i = 0; i <x.length(); i++) {

          count[x.charAt(i)]++;                        //O(n)
          count[y.charAt(i)]--;
      }
      for (int i = 0; i <CHAR; i++) {
          if(count[i]!=0)
              return false;
      }
      return true;
  }
   public static void main(String[] args) {
        Anagram obj=new Anagram();
        System.out.println(obj.isAnagram("Hello","hello"));
    }
}
