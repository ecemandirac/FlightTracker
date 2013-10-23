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
public class Flight {
    
     public FlightListType getFlights(String origTime, 
                                      String origCode,
                                      String destCode){
         
     FlightType flight = new FlightType();
     FlightListType flightList = new FlightListType();
         
        try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            
            String searchFlight = "select * from Flight where '"
                                   + origCode + "'=OrigCode and '"
                                   
                                   + destCode + "'=destCode";
                                   
            
            ResultSet results = stmt.executeQuery(searchFlight);
            
            while(results.next()){
                
                flight.setFlightNo(results.getString("FlightNo"));
                flight.setOrigCode(results.getString("OrigCode"));
                flight.setOrigTime(results.getString("OrigTime"));
                flight.setDestTime(results.getString("DestTime"));
                flight.setDestCode(results.getString("DestCode"));
                flight.setCarrierCode(results.getString("CarrierCode"));
                flight.setDays(results.getString("Monday")+
                               results.getString("Tuesday")+
                               results.getString("Wednesday")+
                               results.getString("Thu")+
                                results.getString("Fri")+
                                results.getString("Sat")+
                                results.getString("Sun"));
                flightList.getFlightList().add(flight);
                flight = null;
                flight = new FlightType();
                                
                
            }
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
         return flightList;
    }
     
     
     public FlightInstanceListType getFlightInstances(String origTime, 
                                                      String startDate,
                                                      String endDate,
                                                      String origCode,
                                                      String destCode
                                                     ){
         
         FlightInstanceType flightInst = new FlightInstanceType();
         FlightInstanceListType flightInstList = new FlightInstanceListType();
         
          try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            
            String searchFlight = "select * from Flight F, FlightInstance FI where F.FlightNo=FI.FlightNo and "
                                   + "FI.Date between '"+ startDate +"' and '"+ endDate + "' and '" 
                                   + origTime + "'=F.OrigTime and '"
                                   + origCode + "'=F.OrigCode and '"
                                   + destCode + "'=F.DestCode";
                                   
            
            ResultSet results = stmt.executeQuery(searchFlight);
            
            while(results.next()){
                
                flightInst.setId(results.getString("FI.ID"));
                flightInst.setFlightNo(results.getString("F.FlightNo"));
                flightInst.setOrigCode(results.getString("F.OrigCode"));
                flightInst.setOrigTime(results.getString("F.OrigTime"));
                flightInst.setDestTime(results.getString("F.DestTime"));
                flightInst.setDestCode(results.getString("F.DestCode"));
                flightInst.setCarrierCode(results.getString("F.CarrierCode"));
                flightInst.setAirplaneCode(results.getString("FI.AirplaneCode"));
                flightInst.setDate(results.getString("FI.Date"));
                flightInst.setAvailableSeats(results.getString("FI.Available_Seats"));
                
                flightInstList.getFlightList().add(flightInst);
                flightInst = null;
                flightInst = new FlightInstanceType();
                                
                
            }
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        return flightInstList;
         
     }
     
     public AirportListType getAirportsByCity(String cityName){
         
         AirportListType airportList = new AirportListType();
         AirportType airport = new AirportType();
         
          try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            
            String searchAirport = "select A.AirportCode, A.Name, A.CityCode from Airport A, City C where '"
                    + cityName + "'=C.CityName and "
                    + "C.CityCode=A.CityCode";
            
            ResultSet results = stmt.executeQuery(searchAirport);
            
            while(results.next()){
                
                airport.setAirportCode(results.getString("A.AirportCode"));
                airport.setName(results.getString("A.Name"));
                airport.setCityCode(results.getString("A.CityCode"));
                
                airportList.getAirports().add(airport);
                airport = null;
                airport = new AirportType();
                                
                
            }
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
         return airportList;
     }
     
     public void updateAvailSeats(String id, String avail){
      
           try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            
            int availInt = Integer.parseInt(avail);
            availInt -=1;
            stmt.execute("update FlightInstance set Available_Seats=" + Integer.toString(availInt) + 
                    " where id=" + id);
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
     }
     
     public CityListType getCities(){
        
        CityListType list = new CityListType();
        CityType city = new CityType();
        
        try{
            
            Connection con = (new DBConnection()).connectDB();
            Statement stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from City");
            
             while(results.next()){
                 
                
                city.setCityCode(results.getString("CityCode"));
                city.setName(results.getString("CityName"));
                city.setCountry(results.getString("Country"));
                city.setAirportCode(results.getString("AirportCode"));
                
                list.getCities().add(city);
                city = null;
                city = new CityType();
               
             }
            
            
            
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
         
     }
    
}
