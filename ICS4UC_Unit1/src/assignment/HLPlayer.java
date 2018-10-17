package assignment;

/**
 * @author Angela Zhou
 * Date: Oct 15th, 2018
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
	private int numOfDieSides;
	
	public HLPlayer() {
		
	}
	
	public HLPlayer(int numOfDieSides) {
		setNumOfDieSides(numOfDieSides);
	}
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	/**
	 * Gameplay Methods
	 */
	
	// Show Points
	public String showPoints() {
		// if call is low 
		if (call == LOW && rollSum >= Die.lowNum * 2 && rollSum <= Die.highNum) {
			points += riskPoints * 2;
		// if call is high
		} else if (call == HIGH && rollSum >= Die.highNum + 2 && rollSum <= Die.highNum * 2) {
			points += riskPoints * 2;
		} else {
			points -= riskPoints;
		}
		String point = Integer.toString(points);
		return point;
	}
	
	// Risk Points
	public void riskPoints(int riskPoints) {
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
		String rollString = Integer.toString(rollSum);
		return rollString;

	}
	
	// Number of Die Sides
	public int getNumOfDieSides() {
		return numOfDieSides;
	}

	public void setNumOfDieSides(int numOfDieSides) {
		this.numOfDieSides = numOfDieSides;
	}
	
	
	
}
