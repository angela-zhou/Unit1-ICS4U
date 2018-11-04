package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * Tetris.java
 * 
 * TODO
 * Ask Mrs Spindler about UML diagram - does it match your description or the classes we have made? 
 * (Be sure to mention private data field orientation existence in all classes that extend Orientable)
 * 
 * Make strokes on blocks - you have already set up the code to make this transition easy
 * (You'll get rid of shortLen, longLen, and OffsetLen data fields)
 * 
 * Take in consideration the Probability of each block showing up
 * 7 Tetris blocks, not four, since they are sorted by Offset
 * May have to get rid of randomShift() method :( 
 * (but suck it up, you've already demonstrated your understanding of random generation through randomAngle())
 * 
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
	
	BlockType[] btArray = {BlockType.SQUARE_BLOCK, BlockType.LINE_BLOCK, BlockType.TWO_AND_TWO_BLOCK, BlockType.THREE_AND_ONE_BLOCK};

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

		// get a new block and display its description in the Text object
		block = getBlock();
		upcoming.setText(block.toString());
	}

	private TetrisBlock getBlock() {
		TetrisBlock block;
		
		// creating a block at random, the four BlockTypes have equal probability of showing up 
		switch (randomBlock()) {
		case SQUARE_BLOCK:
			block = new SquareBlock();
			break;
		case LINE_BLOCK:
			block = new LineBlock(randomAngle(BlockType.LINE_BLOCK));
			break;
		case TWO_AND_TWO_BLOCK:
			block = new TwoAndTwoBlock(randomShift(BlockType.TWO_AND_TWO_BLOCK), randomAngle(BlockType.TWO_AND_TWO_BLOCK));
			break;
		default: // THREE_AND_ONE_BLOCK
			block = new ThreeAndOneBlock(randomShift(BlockType.THREE_AND_ONE_BLOCK), randomAngle(BlockType.THREE_AND_ONE_BLOCK));
			break;
		}
		
		// adding block to the scene graph
		root.getChildren().add(block);
		
		return block;
	}
	
	private BlockType randomBlock() {
		// method to assist getBlock() with creating random TetrisBlocks
	    int index = (int) (Math.random() * btArray.length);
	    return btArray[index];
	}
	
	private int randomAngle(BlockType bt) {
		int angle;
		
		// randomly generate angle for specific case
		switch (bt) {
		case LINE_BLOCK:
			angle = (Math.random() < 0.5) ? 0 : 90; // randomly generate 0 or 90
			break;
		case TWO_AND_TWO_BLOCK:
			angle = (Math.random() < 0.5) ? 0 : 90; // randomly generate 0 or 90
			break;
		case THREE_AND_ONE_BLOCK:
			angle = (int) (Math.random() * 4) * 90; // randomly generate 0, 90, 180, or 270
			break;
		default:
			angle = 0; // all blocks that implement Orientable can have angle of 0
			break;
		}
		return angle;
	}
	
	private int randomShift(BlockType bt) {
		int shift;
		
		// randomly generate offset for specific case
		switch(bt) {
		case TWO_AND_TWO_BLOCK:
			shift = (Math.random() < 0.5) ? -1 : 1; // randomly generate -1 or 1
			break;
		case THREE_AND_ONE_BLOCK:
			shift = (int) (Math.random() * 3) + 1; // randomly generate 1, 2, or 3
			break;
		default:
			shift = 1; // all blocks that extend OffsetBlock can have a shift of 1
			break;
		}
		return shift;
	}

	public static void main(String[] args) {
		launch(args);
	}

}