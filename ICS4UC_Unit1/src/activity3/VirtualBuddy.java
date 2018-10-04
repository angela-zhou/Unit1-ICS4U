package activity3;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VirtualBuddy extends Application {
	
	static final int GAP = 15;
	static final int LARGE_FONT  = 40;
	static final int MEDIUM_FONT = 25;
	static final int SMALL_FONT  = 12;

	@Override
	public void start(Stage myStage) throws Exception {

        GridPane root = new GridPane();
        
        root.setHgap(GAP);
        root.setVgap(GAP);
        root.setPadding(new Insets(GAP, GAP, GAP, GAP));
        
      //Output UI Control
    	ListView<String> lstResponse;

        
        /**
         * Titles
         */
        Label lblTitle = new Label("Virtual Buddy");
        lblTitle.setFont(Font.font(LARGE_FONT));
        root.add(lblTitle, 0, 0, 2, 1);  //pos (0,0), colspan = 2
        
        Label lblSubTitle = new Label("Hi! How are you?");
        lblSubTitle.setFont(Font.font(MEDIUM_FONT));
        root.add(lblSubTitle, 0, 1, 2, 1); //pos (0,1), colspan = 2
        
        /**
         * Buddy Image
         */
        ImageView imgBuddy = new ImageView(getClass().getResource("images/penguin.png").toString());
        root.add(imgBuddy, 0, 2, 1, 5);  //pos (0,2), rowspan = 5
        
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
        root.add(lblResponse, 0, 9, 8, 1);  //pos (9,0), colspan = 8
        
        /**
    	 * Event Handler
    	 */
        btnGreet.setOnAction (event -> lblResponse.setText("My name is Eddie, what is yours?"));
        btnFact.setOnAction  (event -> lblResponse.setText("I'm a bird that can't fly!"));
        btnRiddle.setOnAction(event -> lblResponse.setText("How do penguins drink?\r\n" + 
        												   "Out of beak-ers!"));
        btnTry.setOnAction   (event -> lblResponse.setText("Try not to think about penguins."));
        
        Scene scene = new Scene(root);

        myStage.setTitle("Virtual Buddy");
        myStage.setScene(scene);
        myStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
