package activity5;

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
import javafx.scene.control.TextInputControl;

public class VirtualPet extends Application {

	static final int GAP = 15;
	static final int LARGE_FONT = 30;
	static final int SMALL_FONT = 14;
	
	public final String feed  = "Insert a food type (eg. muffin)";
	public final String sleep = "Insert a place to sleep (eg. couch)";
	public final String play  = "Insert a game to play (eg. soccer)";
	public final String walk  = "Insert a place to walk (eg. the park)";
	public final String groom = "Insert a method of grooming (eg. baths)";

	// Global variables
	Boogle myPet;

	//Output UI Control
	ListView<String> lstResponse;

	@Override
	public void start(Stage myStage) throws Exception {

		GridPane root = new GridPane();

		root.setHgap(GAP);
		root.setVgap(GAP);
		root.setPadding(new Insets(GAP, GAP, GAP, GAP));

		Label lblTitle = new Label("Virtual Pet");
		lblTitle.setFont(Font.font(LARGE_FONT));
		root.add(lblTitle, 0, 0, 2, 1);  //pos (0,0), colspan = 2

		ImageView imgPet = new ImageView(getClass().getResource("images/boogle.png").toString());
		root.add(imgPet, 0, 1, 1, 5);  //pos (0,1), rowspan = 5

		lstResponse = new ListView<String>();
		root.add(lstResponse, 10, 0, 1, 10);  //pos (10,0), rowspan = 10

		myPet = new Boogle();
		lstResponse.getItems().add("Hello, my name is " + myPet.getName() + "!");
		lstResponse.getItems().add(myPet.getPrompt());

		/**
		 *  Input
		 */
		// input layout
		VBox vbxInput = new VBox(GAP);
		root.add(vbxInput, 0, 6, 10, 1); // pos (0,6) colspan = 6

		// feed button
		Button btnFeed = new Button("Feed");
		btnFeed.setFont(Font.font(SMALL_FONT));

		TextField txtFeed = new TextField();
		txtFeed.setPromptText(feed);
		HBox hbxFeed = new HBox(GAP, txtFeed, btnFeed);
        HBox.setHgrow(txtFeed, Priority.ALWAYS);
		vbxInput.getChildren().add(hbxFeed);

		btnFeed.setOnAction(event -> feedBoogle(txtFeed.getText()));

		// play button
		Button btnPlay = new Button("Play");
		btnPlay.setFont(Font.font(SMALL_FONT));

		TextField txtPlay = new TextField();
		txtPlay.setPromptText(play);
		HBox hbxPlay = new HBox(GAP, txtPlay, btnPlay);
		HBox.setHgrow(txtPlay, Priority.ALWAYS);
		vbxInput.getChildren().add(hbxPlay);

		btnPlay.setOnAction(event -> playBoogle(txtPlay.getText()));

		// sleep button
		Button btnSleep = new Button("Sleep");
		btnSleep.setFont(Font.font(SMALL_FONT));
		
		TextField txtSleep = new TextField();
		txtSleep.setPromptText(sleep);
		HBox hbxSleep = new HBox(GAP, txtSleep, btnSleep);
		HBox.setHgrow(txtSleep, Priority.ALWAYS);
		vbxInput.getChildren().add(hbxSleep);

		btnSleep.setOnAction(event -> sleepBoogle(txtSleep.getText()));


		// walk button
		Button btnWalk = new Button("Walk");
		btnWalk.setFont(Font.font(SMALL_FONT));

		TextField txtWalk = new TextField();
		txtWalk.setPromptText(walk);
		HBox hbxWalk = new HBox(GAP, txtWalk, btnWalk);
		HBox.setHgrow(txtWalk, Priority.ALWAYS);
		vbxInput.getChildren().add(hbxWalk);

		btnWalk.setOnAction(event -> walkBoogle(txtWalk.getText()));

		// groom button
		Button btnGroom = new Button("Groom");
		btnGroom.setFont(Font.font(SMALL_FONT));

		TextField txtGroom = new TextField();
		txtGroom.setPromptText(groom);
		HBox hbxGroom = new HBox(GAP, txtGroom, btnGroom);
		HBox.setHgrow(txtGroom, Priority.ALWAYS);
		vbxInput.getChildren().add(hbxGroom);

		btnGroom.setOnAction(event -> groomBoogle(txtGroom.getText()));

		Scene scene = new Scene(root);

		myStage.setTitle("Virtual Pet");
		myStage.setScene(scene);
		myStage.show();
	}

	private void feedBoogle(String food) {
		String boogleResponse = myPet.feed(food, 10);
		lstResponse.getItems().add(boogleResponse);
	}

	private void playBoogle(String game) {
		String boogleResponse = myPet.play(game, 10);
		lstResponse.getItems().add(boogleResponse);
	}

	private void walkBoogle(String place) {
		String boogleResponse = myPet.walk(place, 10);
		lstResponse.getItems().add(boogleResponse);
	}

	private void groomBoogle(String groom) {
		String boogleResponse = myPet.groom(groom, 10);
		lstResponse.getItems().add(boogleResponse);
	}

	private void sleepBoogle(String bed) {
		String boogleResponse = myPet.sleep(bed, 10);
		lstResponse.getItems().add(boogleResponse);
	}


	public static void main(String[] args) {
		launch(args);
	}

}
