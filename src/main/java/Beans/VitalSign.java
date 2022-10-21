/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author preks
 */
public class VitalSign {
    
    private int id;
    private String symptom;
    private int severity;

    public int getId() {
        return id;
    }

    public String getSymptom() {
        return symptom;
    }

    public VitalSign(int id, String symptom, int severity) {
        this.id = id;
        this.symptom = symptom;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
    
}
