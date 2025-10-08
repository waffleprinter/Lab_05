/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author 6298805
 */
import java.util.ArrayList;
import java.util.Objects;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Beverages
        Label beveragesLabel = new Label("Beverages");
        
        ComboBox<Food> beverages = new ComboBox<>();
        beverages.getItems().addAll(
                new Food("Coffee", 2.50),
                new Food("Tea", 2.00),
                new Food("Soft Drink", 1.75),
                new Food("Water", 2.95),
                new Food("Milk", 1.5),
                new Food("Juice", 2.5)
        );
        
        // Appetizers
        Label appetizersLabel = new Label("Appetizers");
        
        ComboBox<Food> appetizers = new ComboBox<>();
        appetizers.getItems().addAll(
                new Food("Soup", 2.50),
                new Food("Salad", 2.00),
                new Food("Spring Rolls", 1.75),
                new Food("Garlic Bread", 2.95),
                new Food("Chips and Salsa", 1.5)
        );
        
        // Main course
        Label mainCourseLabel = new Label("Main Course");
        
        ComboBox<Food> mainCourse = new ComboBox<>();
        mainCourse.getItems().addAll(
                new Food("Steak", 15.00),
                new Food("Grilled Chicken", 13.50),
                new Food("Chicken Alfredo", 13.95),
                new Food("Turkey Club", 11.90),
                new Food("Shrimp Scampi", 18.99),
                new Food("Pasta", 11.75),
                new Food("Fish and Chips", 12.25)
        );
        
        // Dessert
        Label dessertLabel = new Label("Dessert");
        
        ComboBox<Food> dessert = new ComboBox<>();
        dessert.getItems().addAll(
                new Food("Apple Pie", 5.95),
                new Food("Carrot Cake", 4.50),
                new Food("Mud Pie", 4.75),
                new Food("Pudding", 3.25),
                new Food("Apple Crisp", 5.98)
        );
        
        // Tips
        Label tipLabel = new Label("Tip amount");
        
        Slider tip = new Slider();
        tip.setPrefWidth(30);
        
        // Pricing
        Label subtotalLabel = new Label("Subtotal");
        Text subtotal = new Text("0.00");
        
        Label taxLabel = new Label("Tax");
        Text tax = new Text("0.00");
        
        Label totalLabel = new Label("Label");
        Text total = new Text("0.00");
        
        // Update button
        Button updateButton = new Button("Update pricing");
        updateButton.setOnAction(event -> {
            double newSubtotal = 0;
            
            ArrayList<ComboBox<Food>> dropdowns = new ArrayList<>();
            dropdowns.add(beverages);
            dropdowns.add(appetizers);
            dropdowns.add(mainCourse);
            dropdowns.add(dessert);
            
            for (ComboBox<Food> dropdown : dropdowns) {
                if (dropdown.getSelectionModel().getSelectedItem() != null) {
                    newSubtotal += dropdown.getSelectionModel().getSelectedItem().price;
                } 
            }
            
            subtotal.setText(Double.toString(newSubtotal));
        });
        
        // Organziing project
        GridPane root = new GridPane();
        root.setHgap(25);
        root.setVgap(10);
        root.setPadding(new Insets(25));

        // Menu items first two rows
        root.add(beveragesLabel, 0, 0);
        root.add(appetizersLabel, 1, 0);
        root.add(mainCourseLabel, 2, 0);
        root.add(dessertLabel, 3, 0);

        root.add(beverages, 0, 1);
        root.add(appetizers, 1, 1);
        root.add(mainCourse, 2, 1);
        root.add(dessert, 3, 1);
        
        // Pricing and tips last two rows
        root.add(subtotalLabel, 0, 2);
        root.add(tipLabel, 1, 2);
        root.add(taxLabel, 2, 2);
        root.add(totalLabel, 3, 2);
        
        root.add(subtotal, 0, 3);
        root.add(tip, 1, 3);
        root.add(tax, 2, 3);
        root.add(total, 3, 3);
        
        root.add(updateButton, 0, 4);
        
        // Show program
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }
    
    private class Food {
        private String name;
        private double price;
        
        public Food(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}