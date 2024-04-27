package org.example.demo;


import javafx.scene.control.Alert;

public class AlertService {
    public void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
//show warning message when exception occurs
