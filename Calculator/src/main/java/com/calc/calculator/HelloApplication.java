package com.calc.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("calculator-style.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}