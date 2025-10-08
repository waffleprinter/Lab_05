/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author 6298805
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label styleLabel = new Label("Select bag style:");
        
        ListView<String> styleList = new ListView<>();
        styleList.setMaxHeight(150);
        styleList.getItems().addAll(
                "Full decorative", "Beaded", "Pirate design", "Fringed", "Leather", "Plain");
        
        Label quantityLabel = new Label("Select quantity:");
        
        ComboBox<Integer> quantityDropdown = new ComboBox<>();
        for (Integer i = 1; i < 11; i++) {
            quantityDropdown.getItems().add(i);
        }
        
        HBox selectionHBox = new HBox();
        selectionHBox.setPadding(new Insets(25));
        selectionHBox.setSpacing(25);
        selectionHBox.setAlignment(Pos.CENTER);
        selectionHBox.getChildren().addAll(styleLabel, styleList, quantityLabel, quantityDropdown);
        
        BorderPane root = new BorderPane();
        root.setCenter(selectionHBox);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Bag Order Form");
        stage.show();
    }
}
