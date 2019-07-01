/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;


import java.util.ArrayList;
 import java.util.Date;

public class Employee {
    	ArrayList<Qalufication> qualifes =new ArrayList<Qalufication>();

	private String name;
        public static int id;
	private Date dob;
	private String email;
	private String phone;
	public Employee(String name, Date dob, String email, String phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
                this.id++;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
