package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class StopWatchController {

	private Main main;

	@FXML
	private Label tfHour;

	@FXML
	private Label tfMinute;

	@FXML
	private Label tfSeconds;

	@FXML
	private TextArea taTurns;

	@FXML
	public void backToClock(ActionEvent event) {
		main.showClock();
	}
/*
	@FXML
	public void restart(ActionEvent event) {

	}

	@FXML
	public void strartAndStop(ActionEvent event) {

	}

	@FXML
	public void turn(ActionEvent event) {

	}
	*/
	public void setMain(Main main) {
		this.main=main; 
	}
}
