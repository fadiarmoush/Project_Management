package projectmangement;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerOptionsController{
   // CreateMangerUIController cm =new CreateMangerUIController();
    	 static Manager  managers=null;


    @FXML
    private Button b1;

    @FXML
    private Button b2;
     public ManagerOptionsController() {
       // this.managers=cm.managers;
//       System.out.print((managers.get(0).getName()));
  
    //   l2.setText("id: "+ managers.id);
   // setlabel();
    /// t1=new TextField(); 
     // l1=new Label("new");
    }

   
   

  

    @FXML
    void addNewProject(ActionEvent event) throws IOException {

       Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("AddNewProject.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

   

    @FXML
    void logout(ActionEvent event) throws IOException {
        Stage stage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

  

}
