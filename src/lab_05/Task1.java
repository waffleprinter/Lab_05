/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud 6298805
 * 2025/10/08
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Selecting the style of bags
        Label styleLabel = new Label("Select bag style:");
        
        ListView<String> styleList = new ListView<>();
        styleList.setMaxHeight(150);
        styleList.getItems().addAll(
                "Full Decorative", "Beaded", "Pirate Design", "Fringed", "Leather", "Plain");
        
        // Selecting the quantity of bags
        Label quantityLabel = new Label("Select quantity:");
        
        ComboBox<Integer> quantityDropdown = new ComboBox<>();
        for (Integer i = 1; i < 11; i++) {
            quantityDropdown.getItems().add(i);
        }
        
        // Selecting the size of bags
        Label sizeLabel = new Label("Select size:");
        
        RadioButton smallButton = new RadioButton("Small");
        RadioButton mediumButton = new RadioButton("Medium");
        RadioButton largeButton = new RadioButton("Large");
        
        smallButton.setUserData("Small");
        mediumButton.setUserData("Medium");
        largeButton.setUserData("Large");
        
        ToggleGroup sizeGroup = new ToggleGroup();
        smallButton.setToggleGroup(sizeGroup);
        mediumButton.setToggleGroup(sizeGroup);
        largeButton.setToggleGroup(sizeGroup);
        
        VBox sizeVBox = new VBox();
        sizeVBox.setAlignment(Pos.CENTER_LEFT);
        sizeVBox.getChildren().addAll(smallButton, mediumButton, largeButton);
        
        // Organizing UI of style, quantity, and size selection
        HBox selectionHBox = new HBox();
        selectionHBox.setSpacing(25);
        selectionHBox.setAlignment(Pos.CENTER_LEFT);
        selectionHBox.getChildren().addAll(
                styleLabel, styleList, quantityLabel, quantityDropdown, sizeLabel, sizeVBox);
        
        // Order and clear button, and text to display success and error messages
        Text orderText = new Text();

        Button orderButton = new Button("Place Order");
        orderButton.setOnAction(event -> {
            String selectedItemName = styleList.getSelectionModel().getSelectedItem();
            Integer selectedQuantity = quantityDropdown.getSelectionModel().getSelectedItem();
            Toggle selectedToggle = sizeGroup.getSelectedToggle();
            
            if (selectedItemName == null || selectedQuantity == null || selectedToggle == null) {
                orderText.setText("Please pick a style, quantity, and size.");
                return;
            }
            
            orderText.setText(
                    "You ordered " + selectedQuantity + 
                    " " + selectedToggle.getUserData() + 
                    " " + selectedItemName + " bags");
        });
        
        Button clearButton = new Button("Clear Selection");
        clearButton.setOnAction(event -> {
            styleList.getSelectionModel().clearSelection();
            quantityDropdown.getSelectionModel().clearSelection();
            sizeGroup.selectToggle(null);
            orderText.setText("");
        });
        
        // Organizing UI of order, clear, and status text
        HBox buttonHBox = new HBox();
        buttonHBox.setAlignment(Pos.CENTER_LEFT);
        buttonHBox.setSpacing(10);
        buttonHBox.getChildren().addAll(orderButton, clearButton, orderText);
        
        // Organizing UI of entire project
        VBox root = new VBox();
        root.setPadding(new Insets(25));
        root.setSpacing(25);
        root.getChildren().addAll(selectionHBox, buttonHBox);
        
        // Run the program
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Bag Order Form");
        stage.show();
    }
}
