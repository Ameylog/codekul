package jdbc;

/**
 *
 * PrepareStatement :- Taking input from user
 *

 */

import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedUpdateDemo {
    public static void main(String[] args) {

        int id;
        String name;
        String address;
        System.out.println("Enter the id ,name and address:- ");

        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        name=sc.next();
        address=sc.next();


        try{
//            String str="insert into student(id,name,address) values(?,?,?)";
            String update="update student set name=?,address=? where id=?";
            PreparedStatement preparedStatement=Conn.getConn().prepareStatement(update);


            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setInt(3,id);

            int i=preparedStatement.executeUpdate();
            System.out.println("Row is updated sucessfullry "+ i);

        }catch (Exception e){
            throw new RuntimeException(e);
        }




    }
}
