package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TryWithResoures --> means without closing connection or input/output stream.
 * no need to write closing connecton
 * syntax->
 * try( write code ){
 * <p>
 * }
 */
public class TryWithResourses {

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("Sample.txt")) {
//
            String str = "Welcome";
            byte b[] = str.getBytes();
            fileOutputStream.write(b);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fileInputStream = new FileInputStream("Sample.txt")) {
            int i = fileInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
