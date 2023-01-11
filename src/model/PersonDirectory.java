/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author evelynzu
 */
public class PersonDirectory {
    private  ArrayList<Person> personDirectory;

    
    PersonDirectory(ArrayList<Person> persons){
        this.personDirectory = persons;
    }
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addNewPerson() {
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }
    
    public void deletePerosn(Person person) {
        personDirectory.remove(person);
    }
    
    public void editPerson(Person person) {
        
    }
    
}




