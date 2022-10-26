/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.Date;

/**
 *
 * @author preks
 */
public class Encounter {
    
    private static int id = 0;
    private Date date;
    private VitalSign vitalSign;
    private Doctor doctor;
    private String finalComments;

    public Encounter() {
    }

    public Encounter(Date date, VitalSign vitalSign, Doctor doctor, String finalComments) {
        id ++;
        this.date = date;
        this.vitalSign = vitalSign;
        this.doctor = doctor;
        this.finalComments = finalComments;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setFinalComments(String finalComments) {
        this.finalComments = finalComments;
    }

    public static int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getFinalComments() {
        return finalComments;
    }
    
}
