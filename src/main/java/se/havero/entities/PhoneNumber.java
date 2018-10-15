/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.entities;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "https://se.havero/phonenumbers")
public class PhoneNumber implements Serializable{
    
    private long id;
    private long uid;
    private String number;
    private boolean reserved;

    public PhoneNumber() {
    }
    

    public PhoneNumber(long id, long uid, String number, boolean reserved) {
        
        this.id = id;
        this.uid = uid;
        this.number = number;
        this.reserved = reserved;
    }
    
    

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the reserved
     */
    public boolean isReserved() {
        return reserved;
    }

    /**
     * @param reserved the reserved to set
     */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "PhoneNumber [ id "+id+", number="+number+", uid="+uid+", reserved="+reserved+" ]";
    }
    
    
    
    
}
