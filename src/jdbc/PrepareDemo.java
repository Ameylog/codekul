package jdbc;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareDemo {

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
            String str="insert into student(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement=Conn.getConn().prepareStatement(str);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i=preparedStatement.executeUpdate();
            System.out.println("Row is updated sucessfullry "+ i);

        }catch (Exception e){
            throw new RuntimeException(e);
        }




    }
}
