package assignment;

/**
 * @author Angela Zhou
 * Start Sate: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * Die.java
 */
public class Die {
	public static final int LOWEST_NUM  = 1;
	public int numOfSides;
	
	public Die(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	
	public int roll() {
		// generates a random int b/w lowNum - numOfSides
	    int range = numOfSides - LOWEST_NUM + 1;
	    return (int) (Math.random() * range) + LOWEST_NUM;
	}
}