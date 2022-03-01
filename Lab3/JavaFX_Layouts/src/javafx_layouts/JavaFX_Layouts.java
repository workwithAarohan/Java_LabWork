/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_layouts;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class JavaFX_Layouts extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox hbox = new HBox();
        
        Button btn1 = new Button("First");
        btn1.setPrefWidth(75);
        Button btn2 = new Button("Second");
        btn2.setPrefWidth(75);
        Button btn3 = new Button("Third");
        btn3.setPrefWidth(75);
        
        hbox.getChildren().addAll(btn1,btn2,btn3);
        
        
       
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
