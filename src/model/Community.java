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
public class Community {
    String address;
    int zip;  
    HospitalDirectory hospitalDirectory;
    ArrayList<House> houses = new ArrayList<House>();

    public Community(String address, int zip, HospitalDirectory hospitalDirectory) {
        this.address = address;
        this.zip = zip;
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Community(String address, int zip, HospitalDirectory hospitalDirectory, ArrayList<House> houses) {
        this.address = address;
        this.zip = zip;
        this.hospitalDirectory = hospitalDirectory;
        this.houses = houses;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public House addNewHouse(House house) {
        houses.add(house);
        return house;
    }
  
    @Override
    public String toString() {
        return address;
    }
    
    
    
}
