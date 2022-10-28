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
public class DoctorDirectory {
    
    private ArrayList<Doctor> docterDirectory;


    public DoctorDirectory() {   
        docterDirectory = new  ArrayList<Doctor>();
    }

    
    public ArrayList<Doctor> getDocterDirectory() {
        return docterDirectory;
    }

    public void setDocterDirectory(ArrayList<Doctor> docterDirectory) {
        this.docterDirectory = docterDirectory;
    }
    
    
    public void deleteDoctor(Doctor doctor) {
        
        docterDirectory.remove(doctor);
       
    }
    
    
    
}
