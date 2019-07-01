/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.ArrayList;
import java.util.Date;

public class Task implements Update{
	ArrayList<Task> subtasks =new ArrayList<Task>();
        ArrayList<Qalufication> qualifications =new ArrayList<Qalufication>();

	private String id;
	private Date date;
	public double duration;
	public String state;

	
	//private int empCount ;
	public Task() {
		super();
	}
	public Task(String id, Date date, String state) {
		super();
		this.id = id;
		this.date = date;
                this.state=state;
	//	this.empCount = empCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//public int getEmpCount() {
	//	return empCount;
	//}
	//public void setEmpCount(int empCount) {
	//	this.empCount = empCount;
	//}
	@Override
	public void updates(String s) {
			this.state=s;
	}
        public void addSubtasks (Task t)
        {
            subtasks.add(t);
        }
	

	
	
}
