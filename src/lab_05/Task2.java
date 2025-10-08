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
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Beverages
        Label beveragesLabel = new Label("Beverages");
        
        ComboBox<String> beverages = new ComboBox<>();
        beverages.getItems().addAll("Coffee", "Tea", "Soft Drink", "Water", "Milk", "Juice");
        
        VBox beveragesVBox = new VBox(beveragesLabel, beverages);
        beveragesVBox.setAlignment(Pos.CENTER);
        
        // Appetizers
        Label appetizersLabel = new Label("Appetizers");
        
        ComboBox<String> appetizers = new ComboBox<>();
        appetizers.getItems().addAll("Soup", "Salad", "Spring Rolls", "Garlic Bread", "Chips and Salsa");
        
        VBox appetizersVBox = new VBox(appetizersLabel, appetizers);
        appetizersVBox.setAlignment(Pos.CENTER);
        
        // Main course
        Label mainCourseLabel = new Label("Main Course");
        
        ComboBox<String> mainCourse = new ComboBox<>();
        mainCourse.getItems().addAll(
               "Steak", "Grilled Chicken", "Chicken Alfredo", 
                "Turkey Club", "Shrimp Scampi", "Pasta", "Fish and Chips");
        
        VBox mainCourseVBox = new VBox(mainCourseLabel, mainCourse);
        mainCourseVBox.setAlignment(Pos.CENTER);
        
        // Dessert
        Label dessertLabel = new Label("Dessert");
        
        ComboBox<String> dessert = new ComboBox<>();
        dessert.getItems().addAll("Coffee", "Tea", "Soft Drink", "Water", "Milk", "Juice");
        
        VBox dessertVBox = new VBox(dessertLabel, dessert);
        dessertVBox.setAlignment(Pos.CENTER);
        
        // Organzing the various courses
        HBox menuHBox = new HBox(beveragesVBox, appetizersVBox, mainCourseVBox, dessertVBox);
        menuHBox.setPadding(new Insets(25));
        menuHBox.setSpacing(25);
        
        Scene scene = new Scene(menuHBox);
        
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }
}