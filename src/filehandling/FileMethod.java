package filehandling;

import java.io.File;
import java.io.IOException;


//itext libery, multithrading
public class FileMethod {
    public static void main(String[] args) {


        try {
            File file=new File("text2.txt");
            if(file.createNewFile()){
                System.out.println("file created");
            }
            else {
                System.out.println("file is already created");
            }

            System.out.println(file.isFile());
            System.out.println(file.canRead());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
