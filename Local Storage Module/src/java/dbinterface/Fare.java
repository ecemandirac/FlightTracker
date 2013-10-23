/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinterface;

import generated.FaresType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppa
 */
public class Fare {
    
    public FaresType getFare(String carrier, String origCode, String destCode, String fareClass){
        
        FaresType fare = new FaresType();
        
          try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            
            String searchFlight = "select * from Fare where '"
                                   + carrier + "'=carrier and '"
                                   + origCode + "'=origCode and '"
                                   + destCode + "'=destCode and '"
                                   + fareClass + "'=fare_class";
                                   
            
            ResultSet results = stmt.executeQuery(searchFlight);
            
            while(results.next()){
                
                fare.setCost(results.getString("cost_value"));
                fare.setCurrency(results.getString("cost_currency"));
                
            }
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        
        
        return fare;
    }
    
}
