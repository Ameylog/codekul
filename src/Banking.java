import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking {


    public static int isInRange(Scanner sc, int num) {
        if (num < 1 || num > 4) {
            System.out.println("WRONG INPUT. PLease enter Integer between 1 and 3 :");
            num = sc.nextInt();
            isInRange(sc, num);

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 500;
        int withdraw = 0;
        int deposit = 0;
        char choice;

        System.out.println("Hello sir ,\nWelcome To Our Bank \n");
        do {

            System.out.println("Please select the Option Below :- \n1) Balance 2) Deposit 3) Withdraw");
            int num1 = isInRange(sc, sc.nextInt());
            switch (num1) {
                case 1:
                    System.out.println("Balance Operation:- ");
                    System.out.println(bal);
                    break;
                case 2:
                    System.out.println("Deposit Operation :-");
                    try {
                        System.out.println("Enter the Deposit amount:-");
                        deposit = sc.nextInt();
                        bal = bal + deposit;
                        System.out.println("Available Balance is :- " + bal);

                    } catch (Exception e) {
                        System.out.println("Invalid Input. please Enter the correct input");
                    }
                    break;
                case 3:
                    System.out.println("Withdraw Operation:- ");
                    try {

                        if (bal > 500) {
                            System.out.println("Enter your withdraw Amount:- ");
                            withdraw = sc.nextInt();
                            bal = bal - withdraw;
                            System.out.println("The Available balance:- " + bal);
                        } else {
                            System.out.println("Balance is  very low ");
                        }


                    } catch (Exception e) {
                        System.out.println("Invalid Input");
                    }
                    break;

                default:
                    System.out.println("Invalid operation");

            }
            System.out.println();
            System.out.println("Do you want to Continue ?(y/n");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank You");
    }
}