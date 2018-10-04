package activity6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SchoolInformation extends Person {

	static final int GAP = 15;
	static final int LARGE_FONT = 30;
	static final int SMALL_FONT = 14;

	@Override
	public void start(Stage myStage) throws Exception {

		GridPane root = new GridPane();

		root.setHgap(GAP);
		root.setVgap(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));
		
		ImageView student1Image = new ImageView(getClass().getResource("images/default profile pic.png").toString());
		root.add(student1Image, 0, 2, 1, 5);  //pos (0,2), rowspan = 5
		
		Student student1 = new Student();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
