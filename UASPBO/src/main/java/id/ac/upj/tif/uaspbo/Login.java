package id.ac.upj.tif.uaspbo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
public class Login {

    public Login() {

    }

    @FXML
    private Button login;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField fillpassword;



    public void buttonlogin(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        if(username.getText().toString().equals("admin") && fillpassword.getText().toString().equals("123")) {

            m.changeScene("hello-view.fxml");
        }

        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }


}