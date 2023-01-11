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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory = new ArrayList<Doctor>();
    
    public DoctorDirectory(){}
    
    public DoctorDirectory(ArrayList<Doctor> doctors){
        doctorDirectory = doctors;
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addNewDoctor(Doctor newDoctor) {
        this.doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    
}
