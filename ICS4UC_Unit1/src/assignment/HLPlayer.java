package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * HLPLayer.java
 */
public class HLPlayer {
	final   int QUIT   = -1;
	final   int LOW    = 0;
	final   int HIGH   = 1;
	private int points = 1000;
	private int riskPoints;
	private int call;
	private int rollSum;
	private int numOfSides;
	Die die1, die2;
	
	public HLPlayer() {
		
	}
	
	public HLPlayer(int numOfDieSides) {
		setNumOfSides(numOfDieSides);
		
		die1 = new Die(numOfSides);
		die2 = new Die(numOfSides);
	}
	
	/**
	 * Gameplay Methods
	 */
	
	// Show Points
	public String showPoints() {
		// if call is low and user called correctly
		if (call == LOW && rollSum >= Die.lowNum * 2 && rollSum <= numOfSides) {
			points += riskPoints * 2;
		// if call is high and user called correctly
		} else if (call == HIGH && rollSum >= numOfSides + 2 && rollSum <= numOfSides * 2) {
			points += riskPoints * 2;
		// otherwise user loses risk points
		} else {
			points -= riskPoints;
		}
		// convert back to string to show the user
		String point = Integer.toString(points);
		return point;
	}
	
	// Risk Points
	public void riskPoints(int riskPoints) {
		// risk points are ALWAYS positive
		if (riskPoints < 0) {
			riskPoints *= -1;
		}
		this.riskPoints = riskPoints;
	}
	
	public int getRiskPoints() {
		return riskPoints;
	}
	
	// Make call
	public void makeCall(int call) {
		this.call = call;
	}
	
	public int getCall() {
		return call;
	}
	
	// Roll Dice
	public void rollDice() {
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		
		rollSum = roll1 + roll2;
	}
	
	// Show roll
	public String showRoll() {
		// convert to string to show the user
		String rollString = Integer.toString(rollSum);
		return rollString;

	}
	
	// Number of Die Sides
	public int getNumOfSides() {
		return numOfSides;
	}

	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}
	
	
	
}
