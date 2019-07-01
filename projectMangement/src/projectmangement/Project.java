/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.ArrayList;
import java.util.Date;

public class Project {
      
	ArrayList<Task> tasks =new ArrayList<Task>();
	//public String state;
	private String id;
	private String name;
	private String customerName;
        private Manager manger;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(String id, String name, String customerName) throws InterruptedException {
		super();
		this.id = id;
		this.name = name;
		this.customerName = customerName;
                
                //tasks.add(new Task("1", new Date(),10 ));
                //tasks.add(new Task("2", new Date(),10 ));
                //tasks.get(0).addSubtasks(new Task("1_1", new Date(), 3));
                //tasks.get(0).addSubtasks(new Task("1_2", new Date(), 2));
                 //tasks.get(1).addSubtasks(new Task("2_1", new Date(), 5));
                 //System.out.println("Project name:"+ this.name + "   have:");
                 //System.out.println("*************");
                 //doWork();
                 


                        
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
        //String state1="NOT_STARTED";
        //String state2="IN-PROGRESS";
        //String state3="END-PROGRESS";

	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
        /*
	   public void addObserver(Task t) {
	        this.tasks.add(t);
	    }
	 
	    public void removeObserver(Task t) {
	        this.tasks.remove(t);
	    }
            public void donePart() throws InterruptedException
            {
                  Thread.sleep(2000);
            }
	    public void setState(String state, int i) {
	    
                tasks.get(i).updates(state);
                System.out.println("Task no."+tasks.get(i).getId()+":"+tasks.get(i).state);
                
	    }
             public void setState2(String state, int i,int j) {
	    
                tasks.get(i).subtasks.get(j).updates(state);
                System.out.println(tasks.get(i).subtasks.get(j).state);
                
	    }
            public void addTask(Task t)
            {
                this.tasks.add(t);
            }
            public void doWork() throws InterruptedException 
            {
                for (int i=0; i<tasks.size();i++)
                {
                    setState(state1,i);
                    System.out.println("        This task has: "+ tasks.get(i).subtasks.size() + " Sub Tasks");

                    
                }
                donePart();
                System.out.println("----------------------------------------------------------");
                 for (int i=0; i<tasks.size();i++)
                {   System.out.println("For Task"+ tasks.get(i).getId()+":");
                
                    for (int j=0;j<tasks.get(i).subtasks.size();j++)
                    {//System.out.println("For Task"+ tasks.get(i).getId()+":");
                        System.out.print("           Task:"+tasks.get(i).subtasks.get(j).getId()+"-->");
                        setState2(state2, i, j);
                         donePart();
                    }

                    
                }
                System.out.println("----------------------------------------------------------");
                for (int i=tasks.size()-1; i>=0;i--)
                {   System.out.println("For Task"+ tasks.get(i).getId()+":");
                
                    for (int j=0;j<tasks.get(i).subtasks.size();j++)
                    {//System.out.println("For Task"+ tasks.get(i).getId()+":");
                        System.out.print("           Task:"+tasks.get(i).subtasks.get(j).getId()+"-->");
                        setState2(state3, i, j);
                         donePart();
                    }

                    
                }
                
                 
                
                
               
            }
	*/
	
}
