/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author preks
 */
public class House {
    //private static final AtomicInteger id = new AtomicInteger(0); 
    int id;
    String name;
    String owner;
    int members;
    String city;
    String community;
    String country;

    public House(String name, String owner, int members, String city, String community, String country) {
        this.name = name;
        this.owner = owner;
        this.members = members;
        this.city = city;
        this.community = community;
        this.country = country;
        
    }

    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public House() {
          
    }

    public House(String name, String owner, int members, String city, String community) {
       
        this.name = name;
        this.owner = owner;
        this.members = members;
        this.city = city;
        this.community = community;
    }

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

    

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getMembers() {
        return members;
    }
    
    public String toString()
    {
        return String.valueOf(id);
    }

    public void setID(int parseInt) {
        this.id = parseInt;
    }
    
}
