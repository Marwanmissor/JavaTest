package com.myapp.myfx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    TextField nameText;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event)throws IOException {
        String username = nameText.getText();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new.fxml"));
        root = fxmlLoader.load();

        testCon scene2 = fxmlLoader.getController();
        scene2.displayName(username);
       // root = FXMLLoader.load(getClass().getResource("new.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
