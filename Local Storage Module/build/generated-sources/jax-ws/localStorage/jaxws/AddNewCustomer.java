
package localStorage.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addNewCustomer", namespace = "http://localStorage/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewCustomer", namespace = "http://localStorage/", propOrder = {
    "name",
    "contactInfo"
})
public class AddNewCustomer {

    @XmlElement(name = "name", namespace = "")
    private String name;
    @XmlElement(name = "contactInfo", namespace = "")
    private String contactInfo;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getContactInfo() {
        return this.contactInfo;
    }

    /**
     * 
     * @param contactInfo
     *     the value for the contactInfo property
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

}
