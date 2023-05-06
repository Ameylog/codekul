package jdbc;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * When the any processor function stored in database then callable statement are used
 *
 */
public class CallableStatementDemo {

    public static void main(String[] args){

        try {
            CallableStatement callableStatement= Conn.getConn().prepareCall("call getData()");
            ResultSet rs = callableStatement.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
