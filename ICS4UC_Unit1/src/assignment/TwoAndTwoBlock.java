package assignment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * TwoAndTwoBlock.java
 */
public class TwoAndTwoBlock extends OffsetBlock implements Orientable {
	private int orientation;

	public TwoAndTwoBlock(int shift, int angle) {
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
		 * Draw squares according to orientation
		 */
		switch (orientation) {
		case 0:
			switch (offset) {
			case 1:
				sq1 = new Rectangle(SIZE * 1,    0, SIZE, SIZE);
				sq2 = new Rectangle(SIZE * 2,    0, SIZE, SIZE);
				sq3 = new Rectangle(SIZE * 0, SIZE, SIZE, SIZE);
				sq4 = new Rectangle(SIZE * 1, SIZE, SIZE, SIZE);
				break;
			default: // case -1
				sq1 = new Rectangle(SIZE * 0,    0, SIZE, SIZE);
				sq2 = new Rectangle(SIZE * 1,    0, SIZE, SIZE);
				sq3 = new Rectangle(SIZE * 1, SIZE, SIZE, SIZE);
				sq4 = new Rectangle(SIZE * 2, SIZE, SIZE, SIZE);
				break;
			}
			break;
		case 90:
			switch (offset) {
			case 1:
				sq1 = new Rectangle(   0, SIZE * 0, SIZE, SIZE);
				sq2 = new Rectangle(   0, SIZE * 1, SIZE, SIZE);
				sq3 = new Rectangle(SIZE, SIZE * 1, SIZE, SIZE);
				sq4 = new Rectangle(SIZE, SIZE * 2, SIZE, SIZE);
				break;
			default: // case -1
				sq1 = new Rectangle(SIZE, SIZE * 0, SIZE, SIZE);
				sq2 = new Rectangle(SIZE, SIZE * 1, SIZE, SIZE);
				sq3 = new Rectangle(   0, SIZE * 1, SIZE, SIZE);
				sq4 = new Rectangle(   0, SIZE * 2, SIZE, SIZE);
				break;
			}
			break;
		default: // if offset == 1 && orientation == 0
			sq1 = new Rectangle(SIZE * 1,    0, SIZE, SIZE);
			sq2 = new Rectangle(SIZE * 2,    0, SIZE, SIZE);
			sq3 = new Rectangle(SIZE * 0, SIZE, SIZE, SIZE);
			sq4 = new Rectangle(SIZE * 1, SIZE, SIZE, SIZE);
			break;
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
		return "Two and Two Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
	}

}
