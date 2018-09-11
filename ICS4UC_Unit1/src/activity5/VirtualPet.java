package activity5;

import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VirtualPet extends Application {
	
	static final int GAP = 15;
	static final int LARGE_FONT  = 40;
	static final int MEDIUM_FONT = 25;
	static final int SMALL_FONT  = 12;
	
	//Output UI Control
	ListView<String> lstResponse;

	@Override
	public void start(Stage myStage) throws Exception {

        GridPane root = new GridPane();
        
        root.setHgap(GAP);
        root.setVgap(GAP);
        root.setPadding(new Insets(GAP, GAP, GAP, GAP));
        
        /**
         * Titles
         */
        Label lblTitle = new Label("Virtual Pet");
        lblTitle.setFont(Font.font(LARGE_FONT));
        root.add(lblTitle, 0, 0, 2, 1);  //pos (0,0), colspan = 2
        
        Label lblSubTitle = new Label("Hi! How are you?");
        lblSubTitle.setFont(Font.font(MEDIUM_FONT));
        root.add(lblSubTitle, 0, 1, 2, 1); //pos (0,1), colspan = 2
        
        /**
         * Pet Image
         */
        ImageView imgPet = new ImageView(getClass().getResource("images/penguin.png").toString());
        root.add(imgPet, 0, 2, 1, 5);  //pos (0,2), rowspan = 5
        
        /**
         * Buttons
         */
        Button btnGreet = new Button("Greet");
        btnGreet.setFont(Font.font(SMALL_FONT));
        root.add(btnGreet, 1, 2); // pos (1, 2)
        
        Button btnFact = new Button("Fun Fact");
        btnFact.setFont(Font.font(SMALL_FONT));
        root.add(btnFact, 1, 3); // pos (1, 3)
        
        Button btnRiddle = new Button("Riddle");
        btnRiddle.setFont(Font.font(SMALL_FONT));
        root.add(btnRiddle, 1, 4); // pos (1, 4)
        
        Button btnTry = new Button("Try This!");
        btnTry.setFont(Font.font(SMALL_FONT));
        root.add(btnTry, 1, 5); // pos (1, 5)
        
        /**
         * Response
         */
        Label lblResponse = new Label();
        lblResponse.setFont(Font.font(MEDIUM_FONT));
        root.add(lblResponse, 0, 6, 2, 1);  //pos (2,0), colspan = 2
        
        Scene scene = new Scene(root);

        myStage.setTitle("Virtual Pet");
        myStage.setScene(scene);
        myStage.show();
	}
	
	/**
	 * Event Handler
	 */
//	btnGreet.setOnAction(new EventHandler<ActionEvent>() {
//		@Override
//		public void handle(ActionEvent event) {
//			lblResponse.setText("My name is Eddie. What is yours?");
//		}
//	});

	public static void main(String[] args) {
		launch(args);
	}

}
