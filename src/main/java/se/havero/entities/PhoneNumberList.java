
package se.havero.entities;


import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "https://se.havero/phonenumbers")
@XmlType(namespace = "https://se.havero/phonenumbers")
public class PhoneNumberList implements Serializable{
    
    @XmlElement()
    private List<PhoneNumber> phoneNumbers;
    
    public PhoneNumberList(){
    
    }

    public PhoneNumberList(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    
}
