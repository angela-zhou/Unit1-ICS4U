package assignment;


/**
 * 
 * @author Angela Zhou
 * Start Date: Oct 24th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * TetrisBlock.java
 *
 * TO DO:
 * Constructor: 
 * set orientation to zero 
 * set the color to a random color
 * 
 * setLocation method:
 *  will set x and y to given values
 *  
 *  abstract methods:
 *  draw
 *  toString
 */

import javafx.scene.Parent;

public abstract class TetrisBlock extends Parent {
	protected int x;
	protected int y;
	protected int orientation;
	protected String colour;
	public final int size = 25;
	
	public TetrisBlock() {
		setOrientation(0);
		
	}
	
	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		
		this.colour = colour;
	}
}
