package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * TetrisBlock.java
 */
import javafx.scene.Parent;
import javafx.scene.paint.Color;

public abstract class TetrisBlock extends Parent {
	public final static int SIZE = 25;
	protected int x;
	protected int y;
	protected Color colour;
	
	public TetrisBlock() {
		setLocation(0, 0);
		setColour();
	}

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setColour() {
		this.colour = Color.rgb(random(), random(), random());
	}
	
	public int random() {
		// generates a random int to pick colour
	    int range = 255 - 1 + 1;
	    return (int) (Math.random() * range) + 1;
	}
	
	public abstract void draw();
	
	public abstract String toString();
}
