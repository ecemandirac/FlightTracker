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

/**
 *
 * @author peppa
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightListType", propOrder = {
    "flightList"
})

public class FlightListType {
    
    protected List<FlightType> flightList;
    
    public List<FlightType> getFlightList() {
        if (flightList == null) {
            flightList = new ArrayList<FlightType>();
        }
        return this.flightList;
    }

}
