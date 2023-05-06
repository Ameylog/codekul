package filehandling;

import java.io.*;

/**
 * how to write  two files simultanously
 */
public class BufferWriter {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("test2.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hellow Welcome to Codekul");

            System.out.println("File write sucessfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader =new FileReader("test2.txt");
            bufferedReader=new BufferedReader(fileReader);
            int i=bufferedReader.read();

            while(i!=-1){
                System.out.print((char)i);
                i=bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileReader.close();
                bufferedReader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
