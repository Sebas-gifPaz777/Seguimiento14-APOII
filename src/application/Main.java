package application;
	
import java.io.IOException;

import controller.ClockController;
import controller.SelectTimeController;
import controller.StopWatchController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Stage currentStage;
	private int count=0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			showClock();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void showClock() {
		try {
			
			if(count==0) {
				BorderPane root;
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Clock.fxml"));
				root=(BorderPane)loader.load();

				ClockController controller=loader.getController();
				controller.setMain(this);

				Scene scene=new Scene(root);
				scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());

				Stage stage= new Stage();
				stage.setScene(scene);
				stage.show();
				currentStage=stage;
				count++;
			}
			else {
				BorderPane root;
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Clock.fxml"));
				BorderPane list1= (BorderPane)loader.load();
				
				Stage stage = currentStage;
				ClockController controller=loader.getController();
				
				controller.setMain(this);
				
				root = (BorderPane)stage.getScene().getRoot();
				root.setCenter(null);
				root.setCenter(list1);
			}
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void showList() {
		try {
			BorderPane root;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/SelectTime.fxml"));
			BorderPane list1= (BorderPane)loader.load();
			
			Stage stage = currentStage;
			SelectTimeController controller=loader.getController();
			
			controller.setMain(this);
			
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(null);
			root.setCenter(list1);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showStopWatch() {
		try {
			BorderPane root;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Stopwatch.fxml"));
			BorderPane list1= (BorderPane)loader.load();
			
			Stage stage = currentStage;
			StopWatchController controller=loader.getController();
			
			controller.setMain(this);
			
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(null);
			root.setCenter(list1);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
