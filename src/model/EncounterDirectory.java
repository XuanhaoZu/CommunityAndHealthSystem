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
public class EncounterDirectory {
    private ArrayList<Encounter> encounterDirectory;
    
    public EncounterDirectory(ArrayList<Encounter> encounters) {
        this.encounterDirectory = encounters;
    }
    
    public EncounterDirectory() {
        this.encounterDirectory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterDirectory() {
        return encounterDirectory;
    }
    
    
    public Encounter addNewEncounter() {
        Encounter newEncounter = new Encounter();
        encounterDirectory.add(newEncounter);
        return newEncounter;
    }
    
    
}
