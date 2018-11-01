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
	private int offset;
	private int orientation;

	public TwoAndTwoBlock(int shift, int angle) {
		super(shift);
		setOrientation(angle);
	}
	
	@Override
	public void draw() {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		if (offset == -1) {
			rectangle1 = Rectangle(SIZE, 2 * SIZE, colour);
			setLayoutX(x);
			setLayoutY(y);
			rectangle2 = Rectangle(SIZE, 2 * SIZE, colour);
			setLayoutX(SIZE);
			setLayoutY(SIZE);
		} else {
			rectangle1 = Rectangle(SIZE, 2 * SIZE, colour);
			setLayoutX(x);
			setLayoutY(y);
			rectangle2 = Rectangle(SIZE, 2 * SIZE, colour);
			setLayoutX(x);
			setLayoutY(SIZE);
		}
		getChildren().addAll(rectangle1, rectangle2);

	}

	@Override
	public String toString() {
		return "Two and Two Block";
	}

	@Override
	public void setOrientation(int angle) {
		orientation = angle;
		setRotate(orientation);
	}

}
