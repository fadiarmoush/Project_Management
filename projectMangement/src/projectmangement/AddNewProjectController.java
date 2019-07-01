package projectmangement;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewProjectController {
     Project p =new Project();
  //  EditProjectController ep=new EditProjectController();
    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private Label l1;

    @FXML
    private Button b1;

    @FXML
    void addProject(ActionEvent event) throws IOException {
        p.setName(t1.getText());
        p.setId(t2.getText());
        p.setCustomerName(t3.getText());
        EditProjectController.setProject(p);
          Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("EditProject.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
    }

}
