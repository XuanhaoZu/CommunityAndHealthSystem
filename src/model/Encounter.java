/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author evelynzu
 */
public class Encounter {
    
    public Encounter(){}
    
    public Encounter(Date timestamp, String encounterText, VitalSigns vitalSigns) {
        this.timestamp = timestamp;
        this.encounterText = encounterText;
        this.vitalSigns = vitalSigns;
    }
    
    private String encounterText;
    VitalSigns vitalSigns;
    private Date timestamp;

    public String getEncounterText() {
        return encounterText;
    }

    public void setEncounterText(String encounterText) {
        this.encounterText = encounterText;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    
    
    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
        
        return formatter.format(timestamp);
    }
    
    
}
