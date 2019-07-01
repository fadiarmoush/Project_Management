/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.Date;

public class Factory {
	
	public static Employee getEmp(String type,String name, Date dob, String email, String phone){
		if("maneger".equalsIgnoreCase(type)) return new Manager(name, dob, email, phone,1000);
		else if("developer".equalsIgnoreCase(type)) return new Devloper(name, dob, email, phone);
		
		return null;
}
}
