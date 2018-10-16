package assignment;

/**
 * @author Angela Zhou
 * Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * HLPLayer.java
 */
public class HLPlayer {
	private int points = 1000;
	private int riskPoints;
	private int call;
	private int rollSum;
	
	Die die1 = new Die();
	Die die2 = new Die();
	
	public HLPlayer() {
		
	}
	
	/**
	 * Gameplay Methods
	 */
	
	// Show Points
	public String showPoints() {
		if (call == 1 && rollSum >= Die.lowNum && rollSum <= Die.highNum) {
			points += riskPoints;
		}
		String point = Integer.toString(points);
		return point;
	}
	
	// Risk Points
	public void riskPoints(int riskPoints) {
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
	
	
	
}
