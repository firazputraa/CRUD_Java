import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config{
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url= "jdbc:mysql://localhost:3306/tokosepatu";
            String username="root";
            String password="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, username, password);
        }catch(Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
        return mysqlconfig;
    }
}
