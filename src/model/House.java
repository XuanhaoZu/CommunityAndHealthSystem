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
public class House {
    private String address;
    private String owner;
    private ArrayList<Person> persons;
    
    public House(String address, String owner, ArrayList<Person> persons){
        this.address = address;
        this.owner = owner;
        this.persons = persons;
    }
    public House(String address, String owner){
        this.address = address;
        this.owner = owner;
    }
    
    
//    private ArrayList<House> 

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    
    @Override
    public String toString() {
        return address;
    }
    
}
