/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author preks
 */
public class Employee {
    private String name;
    private int id;
    private int age;
    private boolean female;
    private boolean male;
    private String date;
    private int level;
    private String team_info;
    private String position;
    private long phone_no;
    private String email;
    private byte[] picture;
    private String gender;

    public Employee(String name, int id, int age, boolean female, boolean male, int level, String team_info, String position, long phone_no, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.female = female;
        this.male = male;
        this.level = level;
        this.team_info = team_info;
        this.position = position;
        this.phone_no = phone_no;
        this.email = email;
    }

    public Employee(String name, int id, int age, boolean female, boolean male, String date, int level, String team_info, String position, long phone_no, String email, byte[] picture, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.female = female;
        this.male = male;
        this.date = date;
        this.level = level;
        this.team_info = team_info;
        this.position = position;
        this.phone_no = phone_no;
        this.email = email;
        this.picture = picture;
        this.gender = gender;
    }
    
    public Employee(String name, int id, int age, boolean female, boolean male, int level, String team_info, String position, long phone_no, String email, byte[] picture) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.female = female;
        this.male = male;
        this.level = level;
        this.team_info = team_info;
        this.position = position;
        this.phone_no = phone_no;
        this.email = email;
        this.picture =  picture;
        
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public byte[] getPicture() {
        return picture;
    }
    
    
    

    public Employee() {
    }

    
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public boolean isFemale() {
        return female;
    }

    public boolean isMale() {
        return male;
    }

    public String getDate() {
        return date;
    }

    public int getLevel() {
        return level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public String getPosition() {
        return position;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
    
}
