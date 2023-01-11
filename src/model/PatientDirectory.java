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
public class PatientDirectory {
    
    private ArrayList<Patient> patients = new ArrayList<Patient>();
    public PatientDirectory(ArrayList<Patient> patients) {
        this.patients = patients;
        
    }

    public PatientDirectory(){}
    
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
    
    public Patient addNewPatient(Patient newPatient) {
        this.patients.add(newPatient);
        return newPatient;
    }
    
    
}
