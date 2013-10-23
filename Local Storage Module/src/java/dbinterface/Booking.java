/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbinterface;
import generated.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author peppa
 */
public class Booking {
    
    public int addNewCustomer(String name, String contactInfo){
        
        CustomerType customer = new CustomerType();
        
        try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            int lastInsert;
            
            stmt.execute("insert into Customers (Name, ContactInfo) values ('" + 
                          name + "','" +
                          contactInfo + "')");

            ResultSet res = stmt.executeQuery("select LAST_INSERT_ID() L");
            res.next();
            lastInsert=res.getInt("L");
            
            stmt.close();
             
            return lastInsert;
               
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
       
    public int newBooking(String customerID, String flightNo, String carrierCode,String seatNo){
        
         try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            Statement stmt2 = con.createStatement();
            String search2;

            search2="Select * from Reservation where FlightNo=" + flightNo +
                                    " and CarrierCode='" + carrierCode +
                                    "' and SeatNo='" + seatNo +"'";
            ResultSet results2 = stmt2.executeQuery(search2);

            if(!results2.next()){
                stmt.execute("insert into Reservation (CustomerID, SeatNo, FlightNo, CarrierCode) values (" + 
                              customerID + ",'" +
                              seatNo + "'," +
                              flightNo + ",'" +
                              carrierCode +"')");

                ResultSet res = stmt.executeQuery("Select LAST_INSERT_ID() L");
                res.next();
                int lastInsert = res.getInt("L");
                stmt.close();
                
                return lastInsert;

            }else{
                
                stmt.close();
                return 1;
            }
               
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return -1;
    }
        
    
}
