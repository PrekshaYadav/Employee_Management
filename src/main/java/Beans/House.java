/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author preks
 */
public class House {
    
    static int id;
    String name;
    String owner;
    int members;

    public House(String name, String owner, int members) {
        id++;
        this.name = name;
        this.owner = owner;
        this.members = members;
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

    public static int getId() {
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
    
    
    
}
