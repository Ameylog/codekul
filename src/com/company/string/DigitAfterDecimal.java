package com.company.string;
/**
 * for find digit after decimal
 * input:- "123.4552"
 * outpuy:- 4552
 */
public class DigitAfterDecimal {

    public String digitAfterDecimal(String n){
        int pos=n.indexOf('.');
        if(pos<0)
            return "";
        else
            return n.substring(pos+1);

    }

    public static void main(String[] args) {
        DigitAfterDecimal obj=new DigitAfterDecimal();
//        obj.digitAfterDecimal("123.462");
        System.out.println(obj.digitAfterDecimal("123.462"));
    }


}
