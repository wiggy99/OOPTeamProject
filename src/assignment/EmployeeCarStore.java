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
public class EmployeeCarStore {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static boolean containsPerson(String id)
    {
        for (Employee e : employees)
        {
            if(e.getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }
    
    static public Employee searchPersonByID(String id)
    {
        Person found = null;
        for (Employee e : employees)
        {
            if(e.getId().equals(id))
            {
                found = e;
                break;
            }
        }
        return (Employee) found;
    }
}
