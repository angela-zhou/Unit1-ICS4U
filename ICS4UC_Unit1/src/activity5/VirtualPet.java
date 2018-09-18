package activity5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VirtualPet extends Application {
	
	static final int GAP = 15;
	static final int LARGE_FONT = 30;
	static final int SMALL_FONT = 14;
	
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
        
        ImageView imgPet = new ImageView(getClass().getResource("images/boogle.jpg").toString());
        root.add(imgPet, 0, 1, 1, 5);  //pos (0,1), rowspan = 5
        
        lstResponse = new ListView<String>();
        root.add(lstResponse, 2, 0, 1, 6);  //pos (2,0), rowspan = 6
        
        myPet = new Boogle();
        lstResponse.getItems().add("Hello, my name is " + myPet.getName() + "!");
        
        Button btnFeed = new Button("Feed");
        btnFeed.setFont(Font.font(SMALL_FONT));
        btnFeed.setOnAction(event -> feedBoogle());
        root.add(btnFeed, 1, 1); // pos (1,1)
        
        Scene scene = new Scene(root);

        myStage.setTitle("Virtual Pet");
        myStage.setScene(scene);
        myStage.show();
	}
	
	private void feedBoogle() {
		String boogleResponse = myPet.feed("muffin", 10);
		lstResponse.getItems().add(boogleResponse);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
