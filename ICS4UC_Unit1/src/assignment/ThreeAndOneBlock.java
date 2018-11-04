package assignment;

import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * ThreeAndOneBlock.java
 */
public class ThreeAndOneBlock extends OffsetBlock implements Orientable {
	// variables for height and width
	final private int shortLen  = SIZE;
	final private int longLen   = SIZE * 3;
	final private int offsetLen = SIZE * 2;

	private int orientation;

	public ThreeAndOneBlock(int shift, int angle) {
		super(shift);
		setOrientation(angle);
	}

	@Override
	public void draw() {
		// initialize object 
		Rectangle line;
		Rectangle square;

		// draw line depending on orientation
		switch (orientation) {
		case 0:
			line = new Rectangle(0, 0, longLen, shortLen);
			line.setFill(colour);
			// shift square depending on offset
			switch (offset) {
			case 1:
				square = new Rectangle(0, SIZE, shortLen, shortLen);
				square.setFill(colour);
				break;
			case 2:
				square = new Rectangle(SIZE, SIZE, shortLen, shortLen);
				square.setFill(colour);
				break;
			default: // case 3
				square = new Rectangle(offsetLen, SIZE, shortLen, shortLen);
				square.setFill(colour);
				break;
			}
			break;
		case 90:
			line = new Rectangle(0, 0, shortLen, longLen);
			line.setFill(colour);
			// shift square depending on offset
			switch (offset) {
			case 1:
				square = new Rectangle(SIZE, offsetLen, shortLen, shortLen);
				square.setFill(colour);
				break;
			case 2:
				square = new Rectangle(SIZE, SIZE, shortLen, shortLen);
				square.setFill(colour);
				break;
			default: // case 3
				square = new Rectangle(SIZE, 0, shortLen, shortLen);
				square.setFill(colour);
				break;
			}
			break;
		case 180:
			line = new Rectangle(0, SIZE, longLen, shortLen);
			line.setFill(colour);
			// shift square depending on offset
			switch (offset) {
			case 1:
				square = new Rectangle(offsetLen, 0, shortLen, shortLen);
				square.setFill(colour);
				break;
			case 2:
				square = new Rectangle(SIZE, 0, shortLen, shortLen);
				square.setFill(colour);
				break;
			default: // case 3
				square = new Rectangle(0, 0, shortLen, shortLen);
				square.setFill(colour);
				break;
			}
			break;
		case 270:
			line = new Rectangle(SIZE, 0, shortLen, longLen);
			line.setFill(colour);
			// shift square depending on offset
			switch (offset) {
			case 1:
				square = new Rectangle(0, 0, shortLen, shortLen);
				square.setFill(colour);
				break;
			case 2:
				square = new Rectangle(0, SIZE, shortLen, shortLen);
				square.setFill(colour);
				break;
			default: // case 3
				square = new Rectangle(0, offsetLen, shortLen, shortLen);
				square.setFill(colour);
				break;
			}
			break;
		default: // if offset == 1 && orientation == 0
			line   = new Rectangle(0, 0, longLen, shortLen);
			line.setFill(colour);
			square = new Rectangle(0, SIZE, shortLen, shortLen);
			square.setFill(colour);
		}

		// add to root
		setLayoutX(x);
		setLayoutY(y);
		getChildren().addAll(line, square);
	}

	@Override
	public String toString() {
		return "Three and One Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
	}
}
