/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

/**
 *
 * @author 6298805
 */
import java.util.Objects;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
        
//        // Tips
//        Label tipLabel = new Label("Tip amount");
//        Slider tip = new Slider();
//        
//        HBox tipHBox = new HBox(tipLabel, tip);
        
        
        // Organzing the various courses
        GridPane root = new GridPane();
        root.setHgap(25);
        root.setPadding(new Insets(25));

        root.add(beveragesLabel, 0, 0);
        root.add(appetizersLabel, 1, 0);
        root.add(mainCourseLabel, 2, 0);
        root.add(dessertLabel, 3, 0);

        root.add(beverages, 0, 1);
        root.add(appetizers, 1, 1);
        root.add(mainCourse, 2, 1);
        root.add(dessert, 3, 1);
        
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