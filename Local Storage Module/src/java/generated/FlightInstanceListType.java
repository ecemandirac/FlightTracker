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
@XmlType(name = "flightInstanceListType", propOrder = {
    "flightInstList"
})

/**
 *
 * @author peppa
 */
public class FlightInstanceListType {
    
    protected List<FlightInstanceType> flightInstList;
    
    public List<FlightInstanceType> getFlightList() {
        if (flightInstList == null) {
            flightInstList = new ArrayList<FlightInstanceType>();
        }
        return this.flightInstList;
    }

}
