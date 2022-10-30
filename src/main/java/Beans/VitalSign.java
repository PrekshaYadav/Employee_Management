/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.UUID;

/**
 *
 * @author preks
 */
public class VitalSign {
    
    private UUID  id = UUID.randomUUID();
    private String symptom;
    private int severity;

    public VitalSign() {
    }

    public UUID getId() {
        return id;
    }

    public String getSymptom() {
        return symptom;
    }

    public VitalSign( String symptom, int severity) {
        this.symptom = symptom;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
    
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
    
}
