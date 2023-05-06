package controlflow;

/**
 * pattern-->
 *                 *******
 *                  *****
 *                   ***
 *                    *
 *                    *
 *                   ***
 *                  *****
 *                 *******
 */
public class Pattern2 {

    public static void main(String[] args) {
        // sand glass time box
        // Deonward pyramid

        // down pyramid
        for (int i = 4; i >=1; i--) {
            // for spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        // upward pyramid
       for (int i = 1; i <= 4; i++) {
                // for spaces
                for (int j = 1; j <= 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                for (int j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

