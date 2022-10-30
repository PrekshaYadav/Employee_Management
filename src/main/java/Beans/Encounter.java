/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author preks
 */
public class Encounter {
    
    private UUID id = UUID.randomUUID() ;

    
    private LocalDate date;
    private VitalSign vitalSign;
    private Doctor doctor;
    private String finalComments;

    public Encounter() {
        vitalSign = new VitalSign();
    }

    public Encounter(LocalDate date, VitalSign vitalSign, Doctor doctor, String finalComments) {
        
        this.date = date;
        this.vitalSign = vitalSign;
        this.doctor = doctor;
        this.finalComments = finalComments;
    }

    public void setDate(LocalDate date) {
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

    public UUID getId() {
        return id;
    }

    public LocalDate getDate() {
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
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
    
}
