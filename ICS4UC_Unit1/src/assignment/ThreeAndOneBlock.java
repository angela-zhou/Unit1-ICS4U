package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * ThreeAndOneBlock.java
 */
public class ThreeAndOneBlock extends OffsetBlock implements Orientable {
	private int offset;
	private int orientation;
	
	public ThreeAndOneBlock(int shift, int angle) {
		super(shift);
		setOrientation(angle);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Three and One Block";
	}
	
	@Override
	public void setOrientation(int angle) {
		orientation = angle;
		setRotate(orientation);
	}

}
