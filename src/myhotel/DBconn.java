package myhotel;

import java.sql.*;

public class DBconn {

    public static Connection conDB() {
        String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        try {
            Connection conn = DriverManager.getConnection(url,"myhotel","mypassword");
            System.out.println("connection successful y grande");
            return conn;
        }catch(Exception e){
            e.printStackTrace();   
            return null;
        }
        
    }
    
    
}