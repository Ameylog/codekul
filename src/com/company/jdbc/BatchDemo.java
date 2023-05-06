package com.company.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

    public static void main(String[] args) {

        try {

//            String q="Select * from table1";
//            ResultSet rs=statement.executeQuery(q);
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//
//            }
            String q1 = "insert into table1(tId,tname,tCity) values(6,'Saurabh','Nanded')";
            String q2 = "insert into table1(tId,tname,tCity) values(7,'Saurabh','Nagpur')";
            String q3 = "insert into table1(tId,tname,tCity) values(8,'Atharv','Nagothnane')";

            Statement statement = Conn.getConn().createStatement();
            statement.addBatch(q1);
            statement.addBatch(q2);
            statement.addBatch(q3);


            int[] rows = statement.executeBatch();
            for (int i : rows) {
                if (i > 0) {
                    System.out.println("updated....");
                    continue;
                } else {
                    System.out.println("unsucessfully");
                }
                System.out.println("updated....");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
