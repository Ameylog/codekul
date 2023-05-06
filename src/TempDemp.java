
import java.util.*;
import java.lang.*;
import java.io.*;


public class TempDemp {
    /* Name of the class has to be "Main" only if the class is public. */
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int len = s.length();
            int count = 0;
            for (int i = 0; i < len - 3; i++) {
                String newStr = s.substring(i, i + 3);
                for (int j = 0; j < newStr.length(); j++) {
                    char curr = newStr.charAt(j);
                    if (curr == 'a' || curr == 'e' || curr == 'o' || curr == 'u' || curr == 'i') {
                        count++;
                    }

                }
                if (count > 2) {
                    break;
                } else {
                    count = 0;
                }
            }
            if (count > 2) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }
    }
}



