package projectmangement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateMangerUIController {
    	ArrayList<Manager> managers =new ArrayList<Manager>();
//        ManagerOptionsController mo=new ManagerOptionsController();
    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private Button b1;

    @FXML
    void AddManager(ActionEvent event) throws IOException {

        if(isAlpha(t1.getText()))
        {
            managers.add((Manager) Factory.getEmp("maneger", t1.getText(), new Date(), t2.getText(), t3.getText()));
            
          //  System.out.println(((Employee)managers.get(0)).id);
           // ManagerOptionsController.managers=new Manager("fadi", new Date(), "sadd", "adsdasd", 0);
           ManagerOptionsController.managers=managers.get(0);
            Stage stage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ManagerOptions.fxml"));
            Scene scene = new Scene(root); 
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        }
        else
            t1.setText("Not vaild name");
    }
    public boolean isAlpha(String name) {
    return name.matches("[a-zA-Z]+");
}

}
