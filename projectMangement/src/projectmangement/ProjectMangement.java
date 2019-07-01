/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmangement;

import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class ProjectMangement extends Application{

  
     
    public static void main(String[] args) throws InterruptedException {
     // In in main we only create manager, then we add project by this manger and in classes we split praject to tasks and subtasks
    //   Manager mangerExaltProjects= (Manager) Factory.getEmp("maneger", "Sami", new Date(), "Sami@gmail.com", "0599541235");
     //   mangerExaltProjects.addProject(new Project("1","Nokia_project" , "Casper")); //This will aotumatically make tasks in classes
        launch(args);
        
    }
     

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setResizable(false);
	        stage.show();//To change body of generated methods, choose Tools | Templates.
    }
    
}
