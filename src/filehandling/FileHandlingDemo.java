package filehandling;

import java.io.*;

/**
 * java support txt file only in file handling
 * <p>
 * * itext library  to create multiple file in java
 * <p>
 * <p>
 * file close always in finally block because if any exception occur in the class the finally always execution
 */

// file writer a reader  and close file in  finally
public class FileHandlingDemo {

    public static void main(String[] args) throws IOException {

        try {
//            File file = new File("");
//            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream("Sample.txt");
            String str = "Welcome";
            byte b[]  = str.getBytes();
            fileOutputStream.write(b);

            fileOutputStream.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Sample.txt");
            int i = fileInputStream.read();
            while (i != -1){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}