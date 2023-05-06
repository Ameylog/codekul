package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimaryKey {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/fb","root","password");

            String create="create table table1(tId int(20) primary key auto_increment,tname varchar(30) not null ,tCity varchar(30))";

//            String insert="insert into table1(tId,tname,tCity) values(1,'Amol','Nagpur')";
//            String insert="insert into table1(tId,tname,tCity) values(2,'Ankur','')";
//            String insert="insert into table1(tId,tname,tCity) values(3,'','Bhandara')";
            String insert="insert into table1(tId,tname,tCity) values(4,'Aadesh','Nagar')";

            String update="update table1 set tname='Aayush',tCity='Nanded' where tId=3";
            Statement smt=conn.createStatement();
            smt.executeUpdate(update);
            System.out.println("Table created in database..");
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
