/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;
import java.util.ArrayList;
import java.util.Date;

public class Manager extends Employee {
        ArrayList<Project> projects =new ArrayList<Project>();
        private double budget;
	public Manager(String name, Date dob, String email, String phone, double budget) {
		super(name, dob, email, phone);
                this.budget=budget;
		
	}

   

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
        public void addProject(Project p)
        {
            projects.add(p);
        }
        public void startProject(Project P)
        {
            
        }
}
