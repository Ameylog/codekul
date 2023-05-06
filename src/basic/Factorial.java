package basic;

public class Factorial {

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {

            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(factorial(3));
        System.out.println(factorial(0));
    }
}