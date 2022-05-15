package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SelectTimeController {

	private Main main;
	
	@FXML
	private ListView<?> taZones;

	@FXML
	void btAddZone(ActionEvent event) {
		main.showClock();
	}

	
	public void setMain(Main main) {
		this.main=main; 
	}
}
