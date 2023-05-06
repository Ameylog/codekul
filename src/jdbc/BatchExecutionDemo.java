package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExecutionDemo {
    public static void main(String[] args) {

        int id;
        String name;
        String address;

        String str="insert into student(id,name,address) values(?,?,?)";
        try {
            PreparedStatement preparedStatement=Conn.getConn().prepareStatement(str);

//            for (int i = 0; i <100 ; i++) {
//                preparedStatement.setInt(1,i);
//                preparedStatement.setString(2,"name->"+i);
//                preparedStatement.setString(3,"addres->"+i);
//                preparedStatement.addBatch();
//
//            }
//
//            preparedStatement.executeBatch();
//            System.out.println("record inserted sucessfully.......");

            Scanner sc=new Scanner(System.in);
            // scanner
            for (int i = 0; i <5 ; i++) {
                preparedStatement.setInt(1,sc.nextInt());
                preparedStatement.setString(2,sc.next());
                preparedStatement.setString(3,sc.next());
                preparedStatement.addBatch();

            }

            preparedStatement.executeBatch();
            System.out.println("record inserted sucessfully.......");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
