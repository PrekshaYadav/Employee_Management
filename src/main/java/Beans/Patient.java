/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author preks
 */
public class Patient extends Person {
    private int heartRate;
    private int bloodSugarLevel;
    private float weight;
    private float height;
    
    private EncounterDirectory encounterHistory;

    public Patient(int heartRate, int bloodSugarLevel, float weight, float height, ArrayList<Encounter> encounter, String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        super(name, age, gender, contactNo, dateOfBirth, bloodGroup, house);
        this.heartRate = heartRate;
        this.bloodSugarLevel = bloodSugarLevel;
        this.weight = weight;
        this.height = height;
        this.encounterHistory = encounterHistory;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setBloodSugarLevel(int bloodSugarLevel) {
        this.bloodSugarLevel = bloodSugarLevel;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setEncounter(EncounterDirectory encounter) {
        this.encounterHistory = encounter;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getBloodSugarLevel() {
        return bloodSugarLevel;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public EncounterDirectory getEncounter() {
        return encounterHistory;
    }
    
    
}
