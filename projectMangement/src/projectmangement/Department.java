/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Department {
    	ArrayList<Employee> emps =new ArrayList<Employee>();

    private String name;
    private int floar;
    private String description;
    private Department dept;

    public Department(String name, int floar, String description, Department debt) {
        this.name = name;
        this.floar = floar;
        this.description = description;
        this.dept=debt;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloar() {
        return floar;
    }

    public void setFloar(int floar) {
        this.floar = floar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
