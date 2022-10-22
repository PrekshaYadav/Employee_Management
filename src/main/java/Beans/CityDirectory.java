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
public class CityDirectory {
    private ArrayList<City> cityDirectory;

    public CityDirectory() {
        this.cityDirectory = new  ArrayList<City>();
    }

   

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    public City addCity()
    {
        City city = new City();
        cityDirectory.add(city);
        return city;
    }
}
