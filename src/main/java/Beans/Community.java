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
    private int zipcode;
    private ArrayList<House> houseDir;
    private HospitalDirectory hospitalDirectory;
    private String country;
    private String city;

    public Community() {
        houseDir = new ArrayList<House>();
        hospitalDirectory = new HospitalDirectory();
    }
    public Community(String name, int zipcode, ArrayList<House> houseDir, HospitalDirectory hospitalDirectory, String country, String city) {
        this.name = name;
        this.zipcode = zipcode;
        this.houseDir = new ArrayList<House>();
        this.hospitalDirectory = hospitalDirectory;
        this.country = country;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    

    public Community(String name, int zipcode, ArrayList<House> houseDir, HospitalDirectory hospitalDirectory, String country) {
        this.name = name;
        this.zipcode = zipcode;
        this.houseDir = houseDir;
        this.hospitalDirectory = hospitalDirectory;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Community(String name, int zipcode, ArrayList<House> houseDir, HospitalDirectory hospitalDirectory) {
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

    public Community(String name, int zipcode, ArrayList<House> houseDir) {
        this.name = name;
        this.zipcode = zipcode;
        this.houseDir = houseDir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setHouseDir(ArrayList<House> houseDir) {
        this.houseDir = houseDir;
    }

    public String getName() {
        return name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public ArrayList<House> getHouseDir() {
        return houseDir;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(zipcode);
    }
    
}
