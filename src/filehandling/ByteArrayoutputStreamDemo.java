package filehandling;

import java.io.*;

public class ByteArrayoutputStreamDemo {
    public static void main(String[] args) {


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("abc.txt");

            ByteArrayOutputStream obj=new ByteArrayOutputStream ();
            byte[] str="Pune".getBytes();
            obj.write(str);

            obj.writeTo(fileOutputStream);
            obj.writeTo(fileOutputStream1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream1=new FileInputStream("xyz.txt");
            FileInputStream fileInputStream2=new FileInputStream("abc.txt");

           SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream2);

           int i=sequenceInputStream.read();
           while(i!=-1){
               System.out.print((char)i);
               i=sequenceInputStream.read();
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


       // or try with resoures
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
//            FileOutputStream fileOutputStream1 = new FileOutputStream("abc.txt");
//
//            ByteArrayOutputStream obj=new ByteArrayOutputStream ();
//            byte[] str="Pune".getBytes();
//            obj.write(str);
//
//            obj.writeTo(fileOutputStream);
//            obj.writeTo(fileOutputStream1);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            FileInputStream fileInputStream1=new FileInputStream("xyz.txt");
//            FileInputStream fileInputStream2=new FileInputStream("abc.txt");
//
//            SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream1,fileInputStream2);
//
//            int i=sequenceInputStream.read();
//            while(i!=-1){
//                System.out.print((char)i);
//                i=sequenceInputStream.read();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



    }
}
