package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(
		            getClass().getResource("../view/login.fxml")
		        );
			   AnchorPane mypane = (AnchorPane) loader.load();
			   primaryStage.setTitle("Login");
			   primaryStage.setScene(new Scene(mypane));
			   primaryStage.setResizable(true);
			   primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
