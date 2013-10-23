/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ece
 */
public class DBConnection {
    
    

    public Connection connectDB() {
        
        
        Connection con = null;
        
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lsde_project", "root", "piano");	
           
    
           
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
    
}
