package filehandling;

import java.io.*;


public class FIleWriterReaderDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("C:\\Users\\AMEY SHENDE\\IdeaProjects\\Work\\src\\filehandling\\test.txt");
            fileWriter.write("Function: Public Hello World");

            System.out.println("file  write sucessfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\AMEY SHENDE\\IdeaProjects\\Work\\src\\filehandling\\test.txt");
            int i = fileReader.read();

            while (i!=-1) {
                System.out.print((char) i);

                i=fileReader.read();
            }

        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }


    }
}