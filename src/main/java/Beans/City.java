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
public class City {
    
    private int id;
    private String name;
    private String country;
    private ArrayList<Community> communityDir;
    public City(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.communityDir = new ArrayList<Community>();

    }
    

    public City() {
        communityDir = new ArrayList<Community>();

    }

    public City(int id, String name, String country, ArrayList<Community> communityDir) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.communityDir = new ArrayList<Community>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Community> getCommunityDir() {
        return communityDir;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCommunityDir(ArrayList<Community> communityDir) {
        this.communityDir = communityDir;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
    
}
