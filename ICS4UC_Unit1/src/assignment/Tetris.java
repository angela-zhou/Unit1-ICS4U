package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * Tetris.java
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Tetris extends Application {

	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;

	Group root;
	TetrisBlock block;
	Text upcoming;

	@Override
	public void start(Stage myStage) throws Exception {

		root = new Group();
		Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);

		block = getBlock();

		upcoming = new Text(5, 15, block.toString());
		root.getChildren().add(upcoming);

		scene.setOnMouseClicked(event -> placeBlock(event));

		myStage.setTitle("Tetris");
		myStage.setScene(scene);
		myStage.show();

	}

	private void placeBlock(MouseEvent event) {

		//snap block to grid
		int X = ((int) event.getX() / TetrisBlock.SIZE) * TetrisBlock.SIZE;
		int Y = ((int) event.getY() / TetrisBlock.SIZE) * TetrisBlock.SIZE;

		//set the location to X and Y and draw the block
		block.setLocation(X, Y);
		block.draw();

		//get a new block and display its description in the Text object
		block = getBlock();
		upcoming.setText(block.toString());
	}

	private TetrisBlock getBlock() {
		//Creating a block at random and adding it to the scene graph
		TetrisBlock block = (Math.random() < 0.5) ? new LineBlock() : new SquareBlock();
		//TetrisBlock block = new LineBlock();
		root.getChildren().add(block);
		
		return block;
	}

	public static void main(String[] args) {
		launch(args);
	}

}