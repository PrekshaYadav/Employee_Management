/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author preks
 */
public class Hospital {
    
    private String name;
    private Long phoneNo;
    private static int id = 0;
    private DoctorDirectory docterDirector;

    public Hospital(String name, Long phoneNo, DoctorDirectory docterDirector) {
        id++;
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Hospital.id = id;
    }

    public DoctorDirectory getDocterDirector() {
        return docterDirector;
    }

    public void setDocterDirector(DoctorDirectory docterDirector) {
        this.docterDirector = docterDirector;
    }
    
    
    
}
