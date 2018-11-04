package assignment;

import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * TwoAndTwoBlock.java
 */
public class TwoAndTwoBlock extends OffsetBlock implements Orientable {
	// variables for height and width
	final private int shortLen = SIZE;
	final private int longLen  = SIZE * 2;

	private int orientation;

	public TwoAndTwoBlock(int shift, int angle) {
		super(shift);
		setOrientation(angle);
	}

	@Override
	public void draw() {
		// initialize object 
		Rectangle rect1;
		Rectangle rect2;

		// draw object depending on orientation and offset
		if (offset == -1 && orientation == 0) {
			// rectangle 1
			rect1 = new Rectangle(0, 0, longLen, shortLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(SIZE, SIZE, longLen, shortLen);
			rect2.setFill(colour);

		} else if (offset == -1 && orientation == 90) {
			// rectangle 1
			rect1 = new Rectangle(SIZE, 0, shortLen, longLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(0, SIZE, shortLen, longLen);
			rect2.setFill(colour);

		} else if (offset == 1 && orientation == 0) {
			// rectangle 1
			rect1 = new Rectangle(SIZE, 0, longLen, shortLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(0, SIZE, longLen, shortLen);
			rect2.setFill(colour);

		} else if (offset == 1 && orientation == 90) {
			// rectangle 1
			rect1 = new Rectangle(0, 0, shortLen, longLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(SIZE, SIZE, shortLen, longLen);
			rect2.setFill(colour);

		} else { // (offset == 1 && orientation == 0)
			// rectangle 1
			rect1 = new Rectangle(SIZE, 0, longLen, shortLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(0, SIZE, longLen, shortLen);
			rect2.setFill(colour);
			
		}

		// add to root
		setLayoutX(x);
		setLayoutY(y);
		getChildren().addAll(rect1, rect2);
	}

	@Override
	public String toString() {
		return "Two and Two Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
	}
	
}
