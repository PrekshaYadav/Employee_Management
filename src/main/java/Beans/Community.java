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
public class Community {
    
    private String name;
    private Long zipcode;
    private ArrayList<House> houseDir;
    private HospitalDirectory hospitalDirectory;

    public Community(String name, Long zipcode, ArrayList<House> houseDir, HospitalDirectory hospitalDirectory) {
        this.name = name;
        this.zipcode = zipcode;
        this.houseDir = houseDir;
        this.hospitalDirectory = hospitalDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    //private ArrayList<Hospital> hospitalDir;

    public Community(String name, Long zipcode, ArrayList<House> houseDir) {
        this.name = name;
        this.zipcode = zipcode;
        this.houseDir = houseDir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public void setHouseDir(ArrayList<House> houseDir) {
        this.houseDir = houseDir;
    }

    public String getName() {
        return name;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public ArrayList<House> getHouseDir() {
        return houseDir;
    }
    
}
