package com.company.jdbc;

import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafeb","root","password");
            CallableStatement callableStatement =conn.prepareCall("call getData()");

            ResultSet rs=callableStatement.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
