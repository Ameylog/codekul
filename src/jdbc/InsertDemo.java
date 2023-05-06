package jdbc;

import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) {

        try {
            Statement statement = Conn.getConn().createStatement();
            String insert = "insert into student(id,name,address) values(2,'Adesh','pune')";
            String update = "update student set address='Nagar' where id=2";
            String delete = "delete from student where id=2";

//
//            int i = statement.executeUpdate(insert);
//            int i = statement.executeUpdate(update);

            int i = statement.executeUpdate(delete);

//            System.out.println("record inserted successfully" + i);
//            System.out.println("record updated successfully" + i);

            System.out.println("record deleted successfully" + i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
