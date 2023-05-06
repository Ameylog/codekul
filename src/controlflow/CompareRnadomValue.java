package controlflow;


import java.lang.Math.*;
import java.util.Scanner;

public class CompareRnadomValue {

    public static void main(String[] args) {
        int i=(int) (Math.random()*100)+1;
        Scanner sc=new Scanner(System.in);
        int value;
        int attempt=0;

       do {
           System.out.println("Enter the value:- ");
           value = sc.nextInt();
           attempt++;
            if(i>value){
                System.out.println("The number is greater ");
            } else if (i<value) {
                System.out.println("the number is smaller");
            } else{
                System.out.println("The number is match");
            }
       } while (i!=value);
        System.out.println();
    }

}
