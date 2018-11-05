package assignment;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Angela Zhou
 * Start Date: Oct 25th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * SquareBlock.java
 */
public class LineBlock extends TetrisBlock implements Orientable {

	public LineBlock(int angle) {
		super();
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
			sq1 = new Rectangle(SIZE * 0, 0, SIZE, SIZE);
			sq2 = new Rectangle(SIZE * 1, 0, SIZE, SIZE);
			sq3 = new Rectangle(SIZE * 2, 0, SIZE, SIZE);
			sq4 = new Rectangle(SIZE * 3, 0, SIZE, SIZE);
			break;
		default: // case 90
			sq1 = new Rectangle(0, SIZE * 0, SIZE, SIZE);
			sq2 = new Rectangle(0, SIZE * 1, SIZE, SIZE);
			sq3 = new Rectangle(0, SIZE * 2, SIZE, SIZE);
			sq4 = new Rectangle(0, SIZE * 3, SIZE, SIZE);
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
		return "Line Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
	}
}
