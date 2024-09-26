package smartcity.traveller;
import java.sql.*;

public class Database {
    Connection c;
    Statement s;
    
    Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///SmartcityTraveller","root","Pandit@007");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
