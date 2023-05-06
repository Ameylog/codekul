package com.company.string;

public class ReplaceSpace {
    public static void main(String[] args) {

//        String letter="\"Dear Harry,This java Course is nice Thank\"";
//
//        System.out.println(letter);
//        System.out.println(letter.toLowerCase());

        // replace spaces with underscore
//        System.out.println(letter.replace(" ","_"));

//        String letter2="Dear <|name|> , Thank a lot";  //refer to this string
//        letter2=letter2.replace("<|name|>","Amey"); // now letter refer the this string
//        System.out.println(letter2);
//

        // finding double and triple spaces in string
        String myString="Hello their is  double   and triple spaces";
        System.out.println(myString.indexOf("  "));   // return -1 if double space is not present
        System.out.println(myString.indexOf("   "));  // return -1 if triple space not present in String
        // otherwise return the indexof double and triple

    }
}
