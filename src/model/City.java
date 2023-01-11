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
public class City {
    

//    public City(String name, ArrayList<Community> communities, HospitalDirectory hospitalDirectory) {
//        this.name = name;
//        this.communities = communities;
//        this.hospitalDirectory = hospitalDirectory;
//    }
    
    public City (String name, ArrayList<Community> communities) {
        this.name = name;
        this.communities = communities;
        
    }
    
    private String name;
    private ArrayList<Community> communities;
    private HospitalDirectory hospitalDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

//    public HospitalDirectory getHospitalDirectory() {
//        return hospitalDirectory;
//    }
//
//    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
//        this.hospitalDirectory = hospitalDirectory;
//    }
    
     @Override
    public String toString() {
        return name;
    }
    
    
//    public ArrayList<City> cities;
//    
//    public ArrayList<City> getCities(){
//        return cities;
//    }
//    
    
    
    
}
