/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class Hospital {
    private String name;
    private DoctorDirectory doctorDirectory;

    public Hospital(String name, DoctorDirectory doctorDirectory) {
        this.name = name;
        this.doctorDirectory = doctorDirectory;
    }
    
    public Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
