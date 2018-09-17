package activity4;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import simpleIO.Console;

public class DailySpending extends Application{

	static final int GAP         = 15;
	static final int LARGE_FONT  = 20;
	static final int MEDIUM_FONT = 15;
	static final int SMALL_FONT  = 11;

	// UI elements for Input/Output
	TextField txtDailyCost, txtNumDays;
	Label lblResult;

	@Override
	public void start(Stage myStage) throws Exception {

		// instantiate root layout
		VBox root = new VBox(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));

		/**
		 * TITLE
		 */
		// Title
		Label lblTitle = new Label("Daily Spending Calculator");
		lblTitle.setFont(Font.font(LARGE_FONT));
		root.getChildren().add(lblTitle);

		// Instructions for the user
		Label lblInstructions = new Label("What do you spend money on every day?");
		lblInstructions.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblInstructions);
		
		/**
		 * INPUT
		 */
		// instantiate input layout
		HBox hbxInput = new HBox(GAP);
		root.getChildren().add(hbxInput);

		// Asking for daily cost of item
		Label lblDailyCost = new Label ("Daily cost of item:");
		lblDailyCost.setFont(Font.font(SMALL_FONT));
		txtDailyCost = new TextField();
		VBox vbxDailyCost = new VBox(GAP, lblDailyCost, txtDailyCost);
		hbxInput.getChildren().add(vbxDailyCost);

		// Asking for number of days
		Label lblNumDays = new Label ("Enter a number of days:");
		lblNumDays.setFont(Font.font(SMALL_FONT));
		txtNumDays = new TextField();
		VBox hbxNumDays = new VBox(GAP, lblNumDays, txtNumDays);
		hbxInput.getChildren().add(hbxNumDays);
		
		/**
		 * OUTPUT
		 */
		// instantiate output layout
		HBox hbxOutput = new HBox(GAP);
		root.getChildren().add(hbxOutput);

		// Calculate button
		Button btnCalculate = new Button("Calculate");
		hbxOutput.getChildren().add(btnCalculate);

		// instantiate label to hold the result
		lblResult = new Label();
		lblResult.setFont(Font.font(MEDIUM_FONT));
		root.getChildren().add(lblResult);

		// Once button is clicked, grade will be calculated
		btnCalculate.setOnAction(event -> calculateSpending());

		Scene scene = new Scene(root);

		myStage.setTitle("Daily Spending Calculator");
		myStage.setScene(scene);
		myStage.show();
	}

	private void calculateSpending() {
		// Local variables
		double dailyCost, numDays;
		double result;

		// Input
		try { // ensuring all text boxes are filled
			dailyCost = Double.parseDouble(txtDailyCost.getText());
			numDays   = Double.parseDouble(txtNumDays.getText());
		} catch (NumberFormatException e) {
			lblResult.setText("Please enter a number into the text boxes.");
			return;
		}

		// Processing
		result = dailyCost * numDays;

		// Output
		lblResult.setText("Over " + txtNumDays.getText() + " days, your daily spending habit will cost you $" + Console.roundDouble(result, 2));

	}

	public static void main(String[] args) {
		launch(args);
	}
}
