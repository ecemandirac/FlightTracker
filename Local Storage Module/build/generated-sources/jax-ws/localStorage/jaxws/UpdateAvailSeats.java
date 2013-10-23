
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateAvailSeats", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAvailSeats", namespace = "http://localStorage/", propOrder = {
    "id",
    "availSeat"
})
public class UpdateAvailSeats {

    @XmlElement(name = "id", namespace = "")
    private String id;
    @XmlElement(name = "availSeat", namespace = "")
    private String availSeat;

    /**
     * 
     * @return
     *     returns String
     */
    public String getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getAvailSeat() {
        return this.availSeat;
    }

    /**
     * 
     * @param availSeat
     *     the value for the availSeat property
     */
    public void setAvailSeat(String availSeat) {
        this.availSeat = availSeat;
    }

}
