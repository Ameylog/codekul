package controlflow;

import java.util.Scanner;

/**
 * do while loop execute at least one time
 */
public class WhileDemo {
    public static void main(String[] args) {
        // user input value
//        int i = 1;
//        while(i <10){
//            System.out.println(i);
//            i++;
//        }

        Scanner sc=new Scanner(System.in);
        char choice;
        int sum=0;
        do {
            System.out.println("Enter the number:- ");
           int num=sc.nextInt();
            sum=sum+num;
            System.out.println("Do you want continue?");
            choice=sc.next().charAt(0);
        }while(choice=='y' || choice=='Y');

        System.out.println(sum);
    }
}

