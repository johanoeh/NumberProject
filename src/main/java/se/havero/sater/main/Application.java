/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.sater.main;

import entities.PhoneNumber;
import java.util.Collection;
import java.util.Map;
import se.havero.sater.gen.NumberRepository;

/**
 *
 * @author johan
 */
public class Application {
    
    public static void main(String[] args) {
        
        NumberRepository numberRepository  = new NumberRepository(100);
        Map<String, PhoneNumber> phoneNumbers = numberRepository.getPhoneNumbers();
        Collection<PhoneNumber> values = phoneNumbers.values();
        
        for (PhoneNumber phoneNumber : values) {
            System.out.println(phoneNumber);
        }
        
        
    }
}
