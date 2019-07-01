package projectmangement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ShowTasksController {
 static Project p=new Project();
    @FXML
    private TextArea t1;
    
     @FXML
    private Button b1;

    @FXML
    void showTasks(ActionEvent event) {
      
        t1.setText("");
        
        for (int i=0;i< p.tasks.size();i++)
        {
            t1.appendText("task number: " + p.tasks.get(i).getId() + " " +p.tasks.get(i).state+"\n" );
            for (int j=0;j<p.tasks.get(i).subtasks.size();j++)
                t1.appendText("         subtask number: " + p.tasks.get(i).subtasks.get(j).getId() + " " +p.tasks.get(i).subtasks.get(j).state +"\n");

                
        }
       // t1.appendText("\n");
    }

}
