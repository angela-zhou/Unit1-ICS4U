package assignment;

import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 25th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * SquareBlock.java
 */
public class LineBlock extends TetrisBlock implements Orientable {
	// variables for height and width
	final private int shortLen = SIZE;
	final private int longLen  = SIZE * 4;
	
	private int orientation;
	
	public LineBlock(int angle) {
		super();
		setOrientation(angle);
	}

	@Override
	public void draw() {
		// initialize object
		Rectangle line;
		
		// draw object depending on orientation
		switch (orientation) {
		case 0:
			line = new Rectangle(shortLen, longLen, colour);
			break;
		case 90:
			line = new Rectangle(longLen, shortLen, colour);
			break;
		default:
			line = new Rectangle(shortLen, longLen, colour);
			break;
		}
		
		// add to root
		setLayoutX(x);
		setLayoutY(y);
		getChildren().add(line);
	}

	@Override
	public String toString() {
		return "Line Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
	}
}
