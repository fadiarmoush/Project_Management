package projectmangement;

import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddEmpController {

    @FXML
    private Label l1;

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private Button b1;

    @FXML
    void add(ActionEvent event) {
            Alert a = new Alert(AlertType.NONE); 
  
            Employee e=Factory.getEmp("maneger", t1.getText(), new Date(), t2.getText(), t3.getText());
             // set alert type 
                a.setAlertType(AlertType.CONFIRMATION); 
  
                // set content text 
                a.setContentText("Done"); 
  
                // show the dialog 
                a.show(); 
    }

}
