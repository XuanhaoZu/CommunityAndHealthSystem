/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class VitalSigns {
    public VitalSigns(String bloodPressure, String heartRate) {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        
    }
    
    private String bloodPressure;
    private String heartRate;

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }
    
    
}
