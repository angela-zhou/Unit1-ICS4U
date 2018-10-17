package assignment;

/**
 * @author Angela Zhou
 * Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * Die.java
 */
public class Die {
	public static final int lowNum  = 1;
	public static final int highNum = 6;
	
	public Die() {
		
	}
	
	public int roll() {
	    int range = highNum - lowNum + 1;
	    return (int) (Math.random() * range) + lowNum;
	}
}