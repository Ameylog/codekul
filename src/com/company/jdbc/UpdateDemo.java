package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");
            Statement statement=connection.createStatement();

            String update="update ab set address='delhi' where id=2";
            int i=statement.executeUpdate(update);

            System.out.println("Record update sucessfull "+ i);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
