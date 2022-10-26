/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.Date;

/**
 *
 * @author preks
 */
public class Person {
    
    int id;
    String name;
    int age;
    String gender;
    long contactNo;
    Date dateOfBirth;
    String city;
    String community;

    public Person(int id, String name, int age, String gender, long contactNo, Date dateOfBirth, String city, String community, String bloodGroup, House house) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.community = community;
        this.bloodGroup = bloodGroup;
        this.house = house;
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
    
    public Person(int id, String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.house = house;
    }

    public void setId(int id) {
        this.id = id;
    }
    String bloodGroup;
    House house;

    public Person() {
    }

    public Person(String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup, House house) {
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public long getContactNo() {
        return contactNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public Person( String name, int age, String gender, long contactNo, Date dateOfBirth, String bloodGroup) {
        id++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
    }
    
    
}
