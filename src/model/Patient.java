/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class Patient {
    Person person;
    EncounterDirectory encounterDirectory;
    public Patient(Person person, EncounterDirectory encounterDirectory) {
        this.person = person;
        this.encounterDirectory = encounterDirectory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public EncounterDirectory getEncounterDirectory(){
        return encounterDirectory;
    }
    
    @Override
    public String toString() {
        return person.getName();
    }
    
    
}
