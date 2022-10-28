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
public class Hospital {

   
    
    private String name;
    private Long phoneNo;
    private int id = 0;
    private String city;
    private String community;
    private DoctorDirectory docterDirector;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

     public Hospital() {
         docterDirector = new DoctorDirectory();
    }
    
    public Hospital(String name, Long phoneNo, DoctorDirectory docterDirector) {
       
        this.name = name;
        this.phoneNo = phoneNo;
        this.docterDirector = docterDirector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public DoctorDirectory getDocterDirector() {
        return docterDirector;
    }

    public void setDocterDirector(DoctorDirectory docterDirector) {
        this.docterDirector = docterDirector;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
    
    
    
}
