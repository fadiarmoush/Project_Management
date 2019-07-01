/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.ArrayList;
import java.util.Date;

public class Devloper  extends Employee {
	ArrayList<Qalufication> qulifications =new ArrayList<Qalufication>();
        ArrayList<Task> tasks =new ArrayList<Task>();


	public Devloper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Devloper(String name, Date dob, String email, String phone) {
		super(name, dob, email, phone);
		// TODO Auto-generated constructor stub
	}

  
	
	
}