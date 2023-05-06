package controlflow;

import java.util.Scanner;

/**
 * we can implemnt swich inside switch. this called nested switch
 */
public class SwitchDEmo {
    public static void main(String[] args) {
        int i=2;

//        switch (i){
//            case 1:
//                System.out.println("one");
//                //nested switch also
//                switch (i){
//                    case 1:
//                        System.out.println("in inner loop");
//                        break;
//                    case 2:
//                        System.out.println("in outer loop");
//                }
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            default:
//                System.out.println("No Match");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:- ");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:- ");
        int num2=sc.nextInt();
        System.out.println("Enter the operator:- ");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Not found");

        }
    }
}
