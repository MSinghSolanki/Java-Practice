package src;

import java.sql.*;

public class Cons {

    
    public static void main(String[] args) {
        Connection con;
        Statement s;
        
        try{

           // Register the driver
           Class.forName("com.mysql.jdbc.Driver");

           // Creating Connection

           con = DriverManager.getConnection("jdbc:mysql:///practicejdbc", "root", "");

            // if(con.isClosed()){
            //     System.out.println("Connection is Closed");
            // }
            // else{
            //     System.out.println("Connection created......");
            // }
                // Creating Statement
                
                s = con.createStatement();
        }
        catch(Exception e){
  
            System.out.println(e);
        }
    }

    
}
