package activity4;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ExamGradeCalculator extends Application{
	
	static final int GAP         = 15;
	static final int MEDIUM_FONT = 18;
	static final int SMALL_FONT  = 12;
	
	// UI elements for Input/Output
	TextField txtTermMark, txtExamValue, txtDesiredGrade;
	Label lblResult;
	
	@Override
	public void start(Stage myStage) throws Exception {
		
		// instantiate vertical columns
		VBox root = new VBox(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));
		
		// Instructions for the user
		Label lblInstructions = new Label("This tool will determine the percentage you need "
										+ "\non your final exam to obtain a certain grade."
										+ "\nEnter the required information.");
		lblInstructions.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblInstructions);
		
		// Asking for term mark
		Label lblTermMark = new Label ("Your current grade:");
		lblTermMark.setFont(Font.font(SMALL_FONT));
		txtTermMark = new TextField();
		HBox hbxTermMark = new HBox(GAP, lblTermMark, txtTermMark);
		root.getChildren().add(hbxTermMark);
		
		// Asking for exam value
		Label lblExamValue = new Label ("Your exam is worth (%):");
		lblExamValue.setFont(Font.font(SMALL_FONT));
		txtExamValue = new TextField();
		HBox hbxExamValue = new HBox(GAP, lblExamValue, txtExamValue);
		root.getChildren().add(hbxExamValue);
	
	}

}
