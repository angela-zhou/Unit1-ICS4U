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
public class SquareBlock extends TetrisBlock {
	
	public SquareBlock() {
		super();
	}

	@Override
	public void draw() {
		/**
		 * Initialize squares
		 */
		Rectangle sq1 = new Rectangle(   0,    0, SIZE, SIZE);
		Rectangle sq2 = new Rectangle(   0, SIZE, SIZE, SIZE);
		Rectangle sq3 = new Rectangle(SIZE,    0, SIZE, SIZE);
		Rectangle sq4 = new Rectangle(SIZE, SIZE, SIZE, SIZE);
		
		/**
		 * Draw squares
		 */
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
		return "Square Block";
	}
}
