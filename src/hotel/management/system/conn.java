/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;
import java.sql.*;

/**
 *
 * @author surbh
 */
public class conn {
    Connection c;
    Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system","root","");
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
