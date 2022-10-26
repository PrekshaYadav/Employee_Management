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
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    private EncounterDirectory encounterHistory;

    public Patient(int heartRate, int bloodSugarLevel, float weight, float height, ArrayList<Encounter> encounter, String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        super(name, age, gender, contactNo, dateOfBirth, bloodGroup, house);
        this.heartRate = heartRate;
        this.bloodSugarLevel = bloodSugarLevel;
        this.weight = weight;
        this.height = height;
        this.encounterHistory = encounterHistory;
    }

    public Patient() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        encounterHistory = new EncounterDirectory();
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
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
}
