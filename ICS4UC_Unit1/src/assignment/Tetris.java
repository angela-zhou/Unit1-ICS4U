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
		
		TetrisBlock block;
		
		switch (randomBlock()) {
		case 1:
			block = new SquareBlock();
			break;
		case 2:
			block = new LineBlock(randomAngle());
			break;
		case 3:
			block = new TwoAndTwoBlock((Math.random() < 0.5) ? -1 : 1, randomAngle());
			break;
		default:
			block = new SquareBlock();
			break;
		}

		root.getChildren().add(block);
		
		return block;
	}
	
	private int randomBlock() {
		// method to assist getBlock() with creating random TetrisBlocks
		// randomly generates a number between 1 and 4 (the num of types of blocks)
		int range = 3 - 1 + 1;
	    return (int) (Math.random() * range) + 1;
	}
	
	private int randomAngle() {
		return (Math.random() < 0.5) ? 0 : 90;
	}

	public static void main(String[] args) {
		launch(args);
	}

}