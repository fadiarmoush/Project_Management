package projectmangement;



import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UIController {

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    void createManager(ActionEvent event) throws IOException {

        
    	Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("createMangerUI.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void openManager(ActionEvent event) throws IOException {
        Stage stage=new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("openManager.fxml"));
        Scene scene = new Scene(root); 
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}