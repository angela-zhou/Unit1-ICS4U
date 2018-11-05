package assignment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * ThreeAndOneBlock.java
 */
public class ThreeAndOneBlock extends OffsetBlock implements Orientable {
	final private int OFFSET_LEN = SIZE * 2;

	public ThreeAndOneBlock(int shift, int angle) {
		super(shift);
		setOrientation(angle);
	}

	@Override
	public void draw() {
		/**
		 * Initialize squares
		 */
		Rectangle sq1;
		Rectangle sq2;
		Rectangle sq3;
		Rectangle sq4;

		/**
		 * Draw squares according to orientation (must set x and y of 3 squares first)
		 */
		switch (orientation) {
		case 0:
			sq1 = new Rectangle(SIZE * 0, 0, SIZE, SIZE);
			sq2 = new Rectangle(SIZE * 1, 0, SIZE, SIZE);
			sq3 = new Rectangle(SIZE * 2, 0, SIZE, SIZE);
			// draw last square depending on offset
			switch (offset) {
			case 1:
				sq4 = new Rectangle(0, SIZE, SIZE, SIZE);
				break;
			case 2:
				sq4 = new Rectangle(SIZE, SIZE, SIZE, SIZE);
				break;
			default: // case 3
				sq4 = new Rectangle(OFFSET_LEN, SIZE, SIZE, SIZE);
				break;
			}
			break;
		case 90:
			sq1 = new Rectangle(0, SIZE * 0, SIZE, SIZE);
			sq2 = new Rectangle(0, SIZE * 1, SIZE, SIZE);
			sq3 = new Rectangle(0, SIZE * 2, SIZE, SIZE);
			// shift square depending on offset
			switch (offset) {
			case 1:
				sq4 = new Rectangle(SIZE, OFFSET_LEN, SIZE, SIZE);
				break;
			case 2:
				sq4 = new Rectangle(SIZE, SIZE, SIZE, SIZE);
				break;
			default: // case 3
				sq4 = new Rectangle(SIZE, 0, SIZE, SIZE);
				break;
			}
			break;
		case 180:
			sq1 = new Rectangle(SIZE * 0, SIZE, SIZE, SIZE);
			sq2 = new Rectangle(SIZE * 1, SIZE, SIZE, SIZE);
			sq3 = new Rectangle(SIZE * 2, SIZE, SIZE, SIZE);
			// shift square depending on offset
			switch (offset) {
			case 1:
				sq4 = new Rectangle(OFFSET_LEN, 0, SIZE, SIZE);
				break;
			case 2:
				sq4 = new Rectangle(SIZE, 0, SIZE, SIZE);
				break;
			default: // case 3
				sq4 = new Rectangle(0, 0, SIZE, SIZE);
				break;
			}
			break;
		case 270:
			sq1 = new Rectangle(SIZE, SIZE * 0, SIZE, SIZE);
			sq2 = new Rectangle(SIZE, SIZE * 1, SIZE, SIZE);
			sq3 = new Rectangle(SIZE, SIZE * 2, SIZE, SIZE);
			// shift square depending on offset
			switch (offset) {
			case 1:
				sq4 = new Rectangle(0, 0, SIZE, SIZE);
				break;
			case 2:
				sq4 = new Rectangle(0, SIZE, SIZE, SIZE);
				break;
			default: // case 3
				sq4 = new Rectangle(0, OFFSET_LEN, SIZE, SIZE);
				break;
			}
			break;
		default: // if offset == 1 && orientation == 0
			sq1 = new Rectangle(SIZE * 0, 0, SIZE, SIZE);
			sq2 = new Rectangle(SIZE * 1, 0, SIZE, SIZE);
			sq3 = new Rectangle(SIZE * 2, 0, SIZE, SIZE);
			sq4 = new Rectangle(SIZE * 0, SIZE, SIZE, SIZE);
		}

		// Fill Squares
		sq1.setFill(colour);
		sq2.setFill(colour);
		sq3.setFill(colour);
		sq4.setFill(colour);
		// Set Stroke
		sq1.setStroke(Color.BLACK);
		sq2.setStroke(Color.BLACK);
		sq3.setStroke(Color.BLACK);
		sq4.setStroke(Color.BLACK);

		/**
		 * Add to root
		 */
		setLayoutX(x);
		setLayoutY(y);
		getChildren().addAll(sq1, sq2, sq3, sq4);
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
