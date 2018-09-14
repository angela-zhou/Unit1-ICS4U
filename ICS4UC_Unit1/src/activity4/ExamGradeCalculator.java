package activity4;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import simpleIO.Console;

public class ExamGradeCalculator extends Application{
	
	static final int GAP         = 15;
	static final int MEDIUM_FONT = 18;
	static final int SMALL_FONT  = 12;
	
	// UI elements for Input/Output
	TextField txtTermMark, txtExamValue, txtDesiredGrade;
	Label lblResult;
	
	@Override
	public void start(Stage myStage) throws Exception {
		
		// instantiate layout
		VBox root = new VBox(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));
		
		// Instructions for the user
		Label lblInstructions = new Label("This tool will determine the percentage you need "
										+ "on your final exam to obtain a certain grade."
										+ "\nEnter the required information.");
		lblInstructions.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblInstructions);
		
		HBox hbxInput = new HBox(GAP);
		root.getChildren().add(hbxInput);
		
		// Asking for term mark
		Label lblTermMark = new Label ("Your current grade:");
		lblTermMark.setFont(Font.font(SMALL_FONT));
		txtTermMark = new TextField();
		VBox vbxTermMark = new VBox(GAP, lblTermMark, txtTermMark);
		hbxInput.getChildren().add(vbxTermMark);
		
		// Asking for exam value
		Label lblExamValue = new Label ("Your exam is worth (%):");
		lblExamValue.setFont(Font.font(SMALL_FONT));
		txtExamValue = new TextField();
		VBox vbxExamValue = new VBox(GAP, lblExamValue, txtExamValue);
		hbxInput.getChildren().add(vbxExamValue);
		
		// Asking for desired grade
		Label lblDesiredGrade = new Label ("You want (at least):");
		lblDesiredGrade.setFont(Font.font(SMALL_FONT));
		txtDesiredGrade = new TextField();
		VBox vbxDesiredGrade = new VBox(GAP, lblDesiredGrade, txtDesiredGrade);
		hbxInput.getChildren().add(vbxDesiredGrade);
		
		HBox hbxOutput = new HBox(GAP);
		root.getChildren().add(hbxOutput);
		
		// Calculate button
		Button btnCalculate = new Button("Calculate!");
		hbxOutput.getChildren().add(btnCalculate);
		
		// Instantation of the label to hold the result
		lblResult = new Label();
		lblResult.setFont(Font.font(MEDIUM_FONT));
		hbxOutput.getChildren().add(lblResult);
		
		// Once button is clicked, grade will be calculated
		btnCalculate.setOnAction(event -> calculateGrade());
		
		Scene scene = new Scene(root);
		
		myStage.setTitle("Exam Grade Calculator");
		myStage.setScene(scene);
		myStage.show();
	}
	
	private void calculateGrade() {
		// Local variables
		int termMark, examValue, desiredGrade;
		double result;
		
		// Input
		try { // ensuring all text boxes are filled
			termMark     = Integer.parseInt(txtTermMark.getText());
			examValue    = Integer.parseInt(txtExamValue.getText());
			desiredGrade = Integer.parseInt(txtDesiredGrade.getText());
		} catch (NumberFormatException e) {
			lblResult.setText("Invalid entry");
			return;
		}
		
		// Processing
		result = termMark + (desiredGrade - termMark) / (examValue / 100.0);
		
		// Output
		lblResult.setText("You must get " + Console.roundDouble(result, 2) + "% on your exam!");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
