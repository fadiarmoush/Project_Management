package projectmangement;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class EditProjectController implements Initializable{
    static Project p=new Project();
   // ShowTasksController st=new ShowTasksController();
       
    private ToggleGroup tg1;
    private ToggleGroup tg2;
    private ToggleGroup tg3;
    
 @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private TextField t1;

    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r3;

    @FXML
    private Label l1;

    @FXML
    private Button b4;

    @FXML
    private Button b5;
       @FXML
    private Button b6;

    @FXML
    private TextField t2;

    @FXML
    void addEmp(ActionEvent event) throws IOException {
Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("AddEmp.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    String state;
    @FXML
    void addTask(ActionEvent event) {
        if(r1.isSelected())
            state="Not Started";
        else if (r2.isSelected())
            state="In Progress";
        else if(r3.isSelected())
            state="End Progress";
        p.tasks.add(new Task(t1.getText(), new Date(), state));
    }

    @FXML
    void changeState(ActionEvent event) {
        if(r1.isSelected())
            state="Not Started";
        else if (r2.isSelected())
            state="In Progress";
        else if(r3.isSelected())
            state="End Progress";
        for (int i=0;i<p.tasks.size();i++)
            if (p.tasks.get(i).getId().compareTo(t1.getText()) ==0)
            {
                p.tasks.get(i).updates(state);
            }
            
     
    }
      @FXML
    void changeSubTask(ActionEvent event) {
        if(r1.isSelected())
            state="Not Started";
        else if (r2.isSelected())
            state="In Progress";
        else if(r3.isSelected())
            state="End Progress";
        for (int i=0;i<p.tasks.size();i++)
            if (p.tasks.get(i).getId().compareTo(t1.getText()) ==0)
            {   for (int j=0; j<p.tasks.get(i).subtasks.size();j++)
                    if(p.tasks.get(i).subtasks.get(j).getId() .compareTo(t2.getText())==0)
                         p.tasks.get(i).subtasks.get(j).updates(state);
            }
    }
    static void setProject(Project p)
    {
        EditProjectController.p=p;
    }
       @FXML
    void addSubTask(ActionEvent event) {
        for (int i=0;i<p.tasks.size();i++)
            if (p.tasks.get(i).getId().compareTo(t1.getText()) ==0)
            {    if(r1.isSelected())
                   state="Not Started";
                else if (r2.isSelected())
                   state="In Progress";
                 else if(r3.isSelected())
                  state="End Progress";
                p.tasks.get(i).subtasks.add(new Task(t2.getText(), new Date(), state));
                break;
            }
    }
        @FXML
    void showTasks(ActionEvent event) throws IOException {
        if(p!=null)    
        {ShowTasksController.p=p;
         Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("showTasks.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        }
        
        
        
    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tg1=new ToggleGroup();
		

		this.r1.setToggleGroup(tg1);
		this.r2.setToggleGroup(tg1);	
                this.r3.setToggleGroup(tg1);	

    }

}
