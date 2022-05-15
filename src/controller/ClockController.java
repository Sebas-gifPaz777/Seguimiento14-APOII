package controller;


import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ClockController {
	
	private Main main;
	@FXML
	private Label tfHourc;

	@FXML
	private Label tfDate;

	@FXML
	private TextArea taHours;

	@FXML
	public void addHour(ActionEvent event) {
		main.showList();
	}
	
	public void setMain(Main main) {
		this.main=main; 
	}
	@FXML
	public void goToSw(ActionEvent event) {
		main.showStopWatch();
	}
}
