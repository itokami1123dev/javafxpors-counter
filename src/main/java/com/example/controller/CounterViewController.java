package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterViewController {
    private int count = 0;

    @FXML
    private Label counter;

    @FXML
    void initialize() {
        count=0;
    }

    @FXML
    private void countUp(ActionEvent event) {
        count++;
        counter.setText("" + count);
    }
}
