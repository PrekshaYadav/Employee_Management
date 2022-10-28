/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.ArrayList;

/**
 *
 * @author preks
 */
public class EncounterDirectory {

    
    
    private ArrayList<Encounter> encounterHistory;

    public EncounterDirectory() {
        encounterHistory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public EncounterDirectory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public void deleteEncounter(Encounter encounter) {
        
        encounterHistory.remove(encounter);
       
    }
    
}
