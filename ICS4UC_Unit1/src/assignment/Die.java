package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * Die.java
 */
public class Die {
	public static final int LOWEST_NUM  = 1;
	public int numSides;
	
	public Die(int numOfSides) {
		numSides = numOfSides;
	}
	
	public int roll() {
		// generates a random int between LOWEST_NUM - numOfSides
	    int range = numSides - LOWEST_NUM + 1;
	    return (int) (Math.random() * range) + LOWEST_NUM;
	}
}