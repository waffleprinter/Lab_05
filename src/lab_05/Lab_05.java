/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_05;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author 6298805
 */
public class Lab_05 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Task2 task1 = new Task2();
        task1.start(stage);
    }
}
