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
@XmlType(name = "cityListType", propOrder = {
    "cityList"
})
/**
 *
 * @author peppa
 */
public class CityListType {
     protected List<CityType> cityList;
    
    public List<CityType> getCities() {
        if (cityList == null) {
            cityList = new ArrayList<CityType>();
        }
        return this.cityList;
    }
}
