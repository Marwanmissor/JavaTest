package com.myapp.myfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class testCon {
@FXML
    Label nameLable;
    public void displayName(String username){
        nameLable.setText("Hello " + username);
    }
}
