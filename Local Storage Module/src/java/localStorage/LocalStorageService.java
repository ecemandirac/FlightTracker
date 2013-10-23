/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package localStorage;
import dbinterface.Booking;
import dbinterface.Fare;
import generated.*;
import dbinterface.Flight;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author peppa
 */
@WebService(serviceName = "LocalStorageService")
public class LocalStorageService {

    /** This is a sample web service operation */
    @WebMethod(operationName = "getFlights")
    public FlightListType getFlights(@WebParam(name = "origTime") String origTime, 
                                            @WebParam(name = "origCode") String origCode,
                                            @WebParam(name = "destCode") String destCode) {
        
        Flight flight = new Flight();
        
        return flight.getFlights(origTime, origCode, destCode);
       
    }
    
    @WebMethod(operationName = "getFlightInstances")
    public FlightInstanceListType getFlightInstances(@WebParam(name = "origTime") String origTime, 
                                            @WebParam(name = "startDate") String startDate,
                                            @WebParam(name = "endDate") String endDate,
                                            @WebParam(name = "origCode") String origCode,
                                            @WebParam(name = "destCode") String destCode) {
        
        Flight flight = new Flight();
        
        return flight.getFlightInstances(origTime,startDate, endDate,origCode, destCode);
       
    }
    
    @WebMethod(operationName = "getAirportsByCity")
    public AirportListType getAirportsByCity(@WebParam(name = "cityName") String city) 
    {
        
        Flight flight = new Flight();
        
        return flight.getAirportsByCity(city);
       
    }
    
    @WebMethod(operationName = "getFare")
    public FaresType getFare(@WebParam(name = "carrier") String carrier, 
                                   @WebParam(name = "origCode") String origCode,
                                   @WebParam(name = "destCode") String destCode,
                                   @WebParam(name = "fareClass") String fareClass) 
    {
        
        Fare fare = new Fare();
        return fare.getFare(carrier, origCode, destCode, fareClass);
       
    }
    
    
    @WebMethod(operationName = "addNewCustomer")
    public int addNewCustomer(@WebParam(name = "name") String name,
                              @WebParam(name = "contactInfo") String contactInfo) 
    {
        
        Booking book = new Booking();
        return book.addNewCustomer(name, contactInfo);
       
    }
    
    
    @WebMethod(operationName = "newBooking")
    public int newBooking(@WebParam(name = "customerID") String customerID,
                          @WebParam(name = "flightNo") String flightNo,
                          @WebParam(name = "carrierCode") String carrierCode,
                          @WebParam(name = "seatNo") String seatNo) 
    {
        
        Booking book = new Booking();
        return book.newBooking(customerID, flightNo, carrierCode, seatNo);
       
    }
    
    @WebMethod(operationName = "updateAvailSeats")
    public void updateAvailSeats(@WebParam(name = "id") String id,
                          @WebParam(name = "availSeat") String availSeat){
        
        Flight f = new Flight();
        f.updateAvailSeats(id, availSeat);
        
    }
    
    @WebMethod(operationName = "getCities")
    public CityListType getCities(){
        
        Flight f = new Flight();
        return f.getCities();
        
    }
    
}
