package com.company.jdbc;

import java.sql.*;
import java .io.*;

public class ImageDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");

            String q="insert into images(pic) values(?)";
            PreparedStatement pstm=conn.prepareStatement(q);

            //pstm.setString(1,"values");
            FileInputStream fis=new FileInputStream("E:\\ameyphoto.jpeg");
            pstm.setBinaryStream(1,fis,fis.available());
            pstm.executeUpdate();
            System.out.println("done......");


        } catch (ClassNotFoundException | SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
