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

		// draw rectangles depending on orientation
		switch (orientation) {
		case 0:
			rect1 = new Rectangle(longLen, shortLen, colour);
			rect2 = new Rectangle(longLen, shortLen, colour);
			// shift rectangles depending on offset
			switch (offset) {
			case 1:
				rect1.setX(SIZE);
				rect1.setY(0);
				rect2.setX(0);
				rect2.setY(SIZE);
				break;
			default: // case -1
				rect1.setX(0);
				rect1.setY(0);
				rect2.setX(SIZE);
				rect2.setY(SIZE);
				break;
			}
			break;
		case 90:
			rect1 = new Rectangle(shortLen, longLen, colour);
			rect2 = new Rectangle(shortLen, longLen, colour);
			// shift rectangles depending on offset
			switch (offset) {
			case 1:
				rect1.setX(0);
				rect1.setY(0);
				rect2.setX(SIZE);
				rect2.setY(SIZE);
				break;
			default: // case -1
				rect1.setX(SIZE);
				rect1.setY(0);
				rect2.setX(0);
				rect2.setY(SIZE);
				break;
			}
			break;
		default: // if offset == 1 && orientation == 0
			// rectangle 1
			rect1 = new Rectangle(SIZE, 0, longLen, shortLen);
			rect1.setFill(colour);
			// rectangle 2
			rect2 = new Rectangle(0, SIZE, longLen, shortLen);
			rect2.setFill(colour);
			break;
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
