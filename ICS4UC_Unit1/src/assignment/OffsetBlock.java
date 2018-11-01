package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * OffsetBlock.java
 */
public abstract class OffsetBlock extends TetrisBlock {
	private int offset;

	public OffsetBlock(int shift) {
		super();
		setOffset(shift);
	}

	public void setOffset(int shift) {
		offset = shift;
	}

}
