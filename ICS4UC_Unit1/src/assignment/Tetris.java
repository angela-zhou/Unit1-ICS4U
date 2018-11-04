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
	 
	enum BlockType { 
	    SQUARE_BLOCK, LINE_BLOCK, TWO_AND_TWO_BLOCK, THREE_AND_ONE_BLOCK; 
	} 
	
	BlockType[] btArray = {BlockType.SQUARE_BLOCK, BlockType.LINE_BLOCK, BlockType.TWO_AND_TWO_BLOCK};

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
		case SQUARE_BLOCK:
			block = new SquareBlock();
			break;
		case LINE_BLOCK:
			block = new LineBlock(randomAngle(BlockType.LINE_BLOCK));
			break;
		case TWO_AND_TWO_BLOCK:
			block = new TwoAndTwoBlock((Math.random() < 0.5) ? -1 : 1, randomAngle(BlockType.TWO_AND_TWO_BLOCK));
			break;
//		case 4:
//			block = new ThreeAndOneBlock(int offset, int angle); // offset 1-3, angle 0, 90, 180, 270
		default:
			block = new SquareBlock();
			break;
		}

		root.getChildren().add(block);
		
		return block;
	}
	
	private BlockType randomBlock() {
		// method to assist getBlock() with creating random TetrisBlocks
		final int min = 0;
		final int max = btArray.length - 1;
		
		int range = max - min + 1;
	    int index = (int) (Math.random() * range) + min;
	    
	    return btArray[index];
	}
	
	private int randomAngle(BlockType bt) {
		
		int angle;
		
		switch (bt) {
		case LINE_BLOCK:
			angle = (Math.random() < 0.5) ? 0 : 90;
			break;
		case TWO_AND_TWO_BLOCK:
			angle = (Math.random() < 0.5) ? 0 : 90;
			break;
		default:
			angle = 0;
			break;
		}
		return angle;
	}

	public static void main(String[] args) {
		launch(args);
	}

}