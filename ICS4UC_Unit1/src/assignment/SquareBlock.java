package assignment;

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
		Rectangle square = new Rectangle(2 * SIZE, 2 * SIZE, colour);
		setLayoutX(x);
		setLayoutY(y);
		getChildren().add(square);
	}

	@Override
	public String toString() {
		return "Square Block";
	}
}
