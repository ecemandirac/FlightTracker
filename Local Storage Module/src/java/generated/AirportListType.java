/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "airportListType", propOrder = {
    "airportList"
})
/**
 *
 * @author peppa
 */
public class AirportListType {
    
    protected List<AirportType> airportList;
    
    public List<AirportType> getAirports() {
        if (airportList == null) {
            airportList = new ArrayList<AirportType>();
        }
        return this.airportList;
    }
}
