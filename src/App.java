/*
AUTHOR:MIT PATEL
DATE : 25 MARCH 2022
TASK : ASSIGNMENT 3
*/
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class App extends Application {  
    public void start(Stage primaryStage) throws IOException
    {
        //joining fxml file with app class
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Assignment 3_Mit_Bill");    // Set the stage title
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.show();                        // Display the stage
    }   
     public static void main(String[] args) {
            launch(args);
    }
}



