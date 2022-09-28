/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author preks
 */
public class EmployeeHistory {
    
     private ArrayList<Employee> history;

    public EmployeeHistory()
    {
        this.history = new  ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getHistory() {
        return history;
    } 

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addEmployee()
    {
        Employee emp = new Employee();
        history.add(emp);
        return emp;
    }

    public void deleteEmployee(Employee emp_Selected) {
        
        history.remove(emp_Selected);
       
    }
    
    public void insertEmployee(Employee emp)
    {
        history.add(emp);
    }
}
