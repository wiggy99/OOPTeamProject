/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;

/**
 *
 * @author kieran
 */
public class CustomerCarStore {
     public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static boolean containsPerson(String id)
    {
        for (Customer c : customers)
        {
            if(c.getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }
    
    static public Customer searchPersonByID(String id)
    {
        Customer found = null;
        for (Customer c : customers)
        {
            if(c.getId().equals(id))
            {
                found = c;
                break;
            }
        }
        return found;
    }
}
