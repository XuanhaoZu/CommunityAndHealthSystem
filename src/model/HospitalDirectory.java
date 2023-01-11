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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirectory = new ArrayList<Hospital>();
    
    public HospitalDirectory(){}
    
    public HospitalDirectory(ArrayList<Hospital> hospitals){
        hospitalDirectory = hospitals;
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    
    
    
    
    
    public Hospital addNewHospital(Hospital newHospital) {
        hospitalDirectory.add(newHospital);
        return newHospital;
        
    }
    
    
    
    
}
