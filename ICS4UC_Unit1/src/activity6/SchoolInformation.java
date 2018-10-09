package activity6;

 import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

 public class SchoolInformation extends Application {
	
	static final int GAP = 15;
	static final int LARGE_FONT = 30;
	static final int SMALL_FONT = 14;
	
	//Global variables
	Student student1;
	
 	@Override
	public void start(Stage myStage) throws Exception {
 		int numOfColumns = 2;
 		String[] studentNames = {"Andrew" , "Bobby", "Clarissa", "Devon" , "Edward"};
 	  
 		TilePane root = new TilePane();
 	    root.setHgap(GAP);
 	    root.setPrefColumns(numOfColumns);
        
        //ImageView imgStudent = new ImageView(getClass().getResource("images/default profile pic.png").toString());
        
        for (int i = 0; i < studentNames.length; i++) {
        	Label name = new Label(studentNames[i]);
            root.getChildren().addAll(name, new ImageView(getClass().getResource("images/default profile pic.png").toString()));
        }
        
        Scene scene = new Scene(root);
        myStage.setTitle("School Information");
        myStage.setScene(scene);
        myStage.show();
	}
 	public static void main(String[] args) {
		launch(args);
	}
 }