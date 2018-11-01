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
	private int orientation;
	
	public LineBlock(int angle) {
		super();
		setOrientation(angle);
	}

	@Override
	public void draw() {
		Rectangle line = new Rectangle(SIZE, 4 * SIZE, colour);
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
		setRotate(orientation);
	}
}
