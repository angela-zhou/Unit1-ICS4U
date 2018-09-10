package activity1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main (String [] args) {
		launch(args);
	}

	public void start (Stage myStage) throws Exception{
		
		Text text = new Text(10, 50, "Hello World!");
		
		// can insert title of a type of font before font size
		text.setFont(Font.font(50));

		Group root = new Group(text);

		Scene scene = new Scene(root);

		myStage.setScene(scene);
		
		myStage.setTitle("Welcome to JavaFX!");
		
		myStage.show();

	}
}
