/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FareCalculator;

import localstorage.FaresType;

/**
 *
 * @author peppa
 */
public class Calculate {
    
    public FaresType fareCalculate(String carrier, String date,String origCode, String destCode, String fareClass){
        
        int price = 0;
        int month;
        
        FaresType fare = getFare(carrier, origCode, destCode, fareClass);
        
        if(date.substring(5, 6) == "0"){
            month = Integer.parseInt(date.substring(6, 7));
        }
        else{
            month = Integer.parseInt(date.substring(5, 7));
        }
        
        if(month >= 6 && month <= 9){
            
            price = Integer.parseInt(fare.getCost());
            price *= 2;
            fare.setCost(Integer.toString(price));
        }
        
        return fare;
    }

    private static FaresType getFare(java.lang.String carrier, java.lang.String origCode, java.lang.String destCode, java.lang.String fareClass) {
        localstorage.LocalStorageService_Service service = new localstorage.LocalStorageService_Service();
        localstorage.LocalStorageService port = service.getLocalStorageServicePort();
        return port.getFare(carrier, origCode, destCode, fareClass);
    }
    
   
        
        
   
}
