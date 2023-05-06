package com.company.exceptionhandling;

import com.company.opert.Arithmetic;

public class ExceptionHanding {
    public static void main(String[] args) {

        int j=17,l=2;
        int arr[]=new int[4];

//        try{
////            int i=j/0;
//            arr[4]=45;
//        }catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception occure");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Array out of size");
//        }
//
//        System.out.println("rest the code");

        try{
            try{
                int i=j/0;

            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
            }
           try{
               arr[7]=35;

           }catch (ArrayIndexOutOfBoundsException e){
               System.out.println("Array out of size");
           }


        }catch (Exception e){
            System.out.println("handle the exception by outer catch");
        }

        System.out.println("rest of code");

    }
}
