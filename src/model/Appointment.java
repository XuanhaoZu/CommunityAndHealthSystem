/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author evelynzu
 */
public class Appointment {
    private Date date;
    private Doctor doctor;
    private Patient patient;
    private boolean state;

    public Appointment(Date date, Doctor doctor, Patient patient, boolean state) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return doctor.getPerson().getName();
    }
    
    
}
