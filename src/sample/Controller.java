package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class Controller {

    public TextField userNameField;
    public PasswordField passwordField;

    @FXML
    public void initialize(){
        userNameField.textProperty().bindBidirectional(userName);
        passwordField.textProperty().bindBidirectional(password);
    }
    private SimpleStringProperty userName;
    private SimpleStringProperty password;

    public Controller(){
        userName = new SimpleStringProperty("");
        password = new SimpleStringProperty("");
    }

    public void loginClick(ActionEvent actionEvent) {
        System.out.println("Username:"+userName.getValue());
        System.out.println("Password:"+password.getValue());
    }
}
