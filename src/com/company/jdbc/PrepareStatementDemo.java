package com.company.jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class PrepareStatementDemo {
    public static void main(String[] args) {

        int id;
        String name;
        String address;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id name and address:- ");
        id=sc.nextInt();
        name=sc.next();
        address=sc.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");

            String insert="insert into ab(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insert);

           preparedStatement.setInt(1,id);
           preparedStatement.setString(2,name);
           preparedStatement.setString(3,address);

           int i= preparedStatement.executeUpdate();

            System.out.println("Row updateed sucessfully "+i);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
