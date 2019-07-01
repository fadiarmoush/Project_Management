package projectmangement;

import java.io.IOException;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OpenManagerController {

    @FXML
    private TextField t1;

    @FXML
    private Button b1;
    
    @FXML
    private Label l1;

    @FXML
    void select(ActionEvent event) throws IOException {

        if(t1.getText().compareTo("")==0)
        {
                Alert a = new Alert(Alert.AlertType.NONE); 
  
             // set alert type 
                a.setAlertType(Alert.AlertType.CONFIRMATION); 
  
                // set content text 
                a.setContentText("Plz enter id"); 
  
                // show the dialog 
                a.show();
        }
        else
        {
        Stage stage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ManagerOptions.fxml"));
            Scene scene = new Scene(root); 
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
        }

}
