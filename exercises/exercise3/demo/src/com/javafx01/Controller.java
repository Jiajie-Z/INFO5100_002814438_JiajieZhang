package com.javafx01;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Label expression;

    @FXML
    private Label result;

    private  boolean lastIsNumber = true;

    @FXML
    public void onClicked(Event event) {
        EventTarget target = event.getTarget();
        Button button = (Button) target;
        String text = button.getText();
        try {
            int i = Integer.parseInt(text);
            if (lastIsNumber) {
                String resultVal = result.getText();
                if (resultVal.length() >= 10) {
                    return;
                }
                long newVal = Long.parseLong(resultVal) * 10 + i;
                result.setText(newVal + "");
                lastIsNumber = true;
            } else {
                result.setText(text);
            }

        } catch (Exception ex) {
            switch (text) {
                case "+":
                    expression.setText(result.getText() + "+");
                    break;
                case "-":
                    expression.setText(result.getText() + "-");
                    break;
                case "*":
                    expression.setText(result.getText() + "*");
                    break;
                case "/":
                    expression.setText(result.getText() + "/");
                    break;
                case "=":
                    String express = expression.getText() + result.getText();
                    expression.setText(express+ "=");
                    if (express.contains("+")){
                        String[] split = express.split( "\\+");
                        int resultValue = calculateValue(Integer.parseInt(split[0]), Integer.parseInt(split[1]), "+");
                        result.setText(resultValue + "");
                    } else if (express.contains("-")) {
                        String[] split = express.split( "-");
                        int resultValue = calculateValue(Integer.parseInt(split[0]), Integer.parseInt(split[1]), "-");
                        result.setText(resultValue + "");
                    }else if (express.contains("*")) {
                        String[] split = express.split( "\\*");
                        int resultValue = calculateValue(Integer.parseInt(split[0]), Integer.parseInt(split[1]), "*");
                        result.setText(resultValue + "");
                    }else if (express.contains("/")) {
                        String[] split = express.split( "/");
                        int resultValue = calculateValue(Integer.parseInt(split[0]), Integer.parseInt(split[1]), "/");
                        result.setText(resultValue + "");
                    }

                    break;
                default:
                    break;
            }
            lastIsNumber = false;
        }
    }

    private int calculateValue(int a, int b, String operator){
        int result = 0;
        switch(operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }
}