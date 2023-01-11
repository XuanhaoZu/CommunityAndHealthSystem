/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class Doctor {
    Person person;
    
    public Doctor(Person person) {
        this.person = person;
        
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
//    private String name;
//
//    public Doctor(String name) {
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    
   
    
    @Override
    public String toString() {
        return person.getName();
    }
    
    
    
    
}
