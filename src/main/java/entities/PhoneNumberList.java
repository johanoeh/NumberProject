/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author johan
 */
@XmlRootElement(namespace = Namespace.NAME_SPACE )
@XmlType(namespace = Namespace.NAME_SPACE )
public class PhoneNumberList implements Serializable{
    
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
