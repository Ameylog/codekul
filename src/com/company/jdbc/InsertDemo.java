package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");
            Statement statement=connection.createStatement();
            String insert="insert into ab(id,name,address) values(3,'Anmol','Nagpur')";

            int i=statement.executeUpdate(insert);
            System.out.println("Record is inserted in table"+i);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
