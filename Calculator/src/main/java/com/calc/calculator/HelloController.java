package com.calc.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private Label display;
    private Double broj;
    private boolean pocetak=true;
    private String operacija="";

    // Dugme za brojeve (0-9)
    @FXML
    private void pritisnutiBroj(ActionEvent event) {
        if(pocetak){
            display.setText("");
            pocetak=false;
        }
        Button button = (Button) event.getSource();
        String unos=button.getText();
        display.setText(display.getText() + unos);
    }

    @FXML
    private void pritisnutaOperacija(ActionEvent event) {
        Button button = (Button) event.getSource();
        String op = button.getText();
        if(!op.equals("=")){
            if(!operacija.isEmpty())
                return;
            operacija=op;
            broj = Double.parseDouble(display.getText());
            display.setText("");
        }
        else {
            if(operacija.isEmpty())
                return;
            if(display.getText().isEmpty()){
                display.setText("ERROR");
                operacija="";
                pocetak=true;
            }
            display.setText(izracunaj(broj, Double.parseDouble(display.getText()), operacija));
            operacija="";
            pocetak=true;
        }
    }

    @FXML
    private void clearBtn(ActionEvent event) {
        display.setText("0");
        broj=0.;
        pocetak=true;
    }

    private String izracunaj(Double broj1, Double broj2, String operacija) {
        switch(operacija){
            case "+":
                return String.valueOf(broj1+broj2);
            case "-":
                return String.valueOf(broj1-broj2);
            case "x":
                return String.valueOf(broj1*broj2);
            case "/":
                return String.valueOf(broj1/broj2);

        }
        return "Error";
    }
}