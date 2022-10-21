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
public class Doctor extends Person{
    //static private int id;
    private String specialization;
    private int experience;
    private String license;
    
    private ArrayList<VitalSign> vitalSigns;

    public Doctor(String specialization, int experience, String license, ArrayList<VitalSign> vitalSigns, String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        super(name, age, gender, contactNo, dateOfBirth, bloodGroup, house);
        this.specialization = specialization;
        this.experience = experience;
        this.license = license;
        this.vitalSigns = vitalSigns;
    }

    public void setVitalSigns(ArrayList<VitalSign> vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public ArrayList<VitalSign> getVitalSigns() {
        return vitalSigns;
    }

    public Doctor(String specialization, int experience, String license, String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        super(name, age, gender, contactNo, dateOfBirth, bloodGroup, house);
        this.specialization = specialization;
        this.experience = experience;
        this.license = license;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    //private ArrayList<VitalSign> VitalSign;

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public String getLicense() {
        return license;
    }
}
