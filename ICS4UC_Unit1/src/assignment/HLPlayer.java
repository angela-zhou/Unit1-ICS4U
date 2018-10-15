package assignment;

/**
 * @author Angela Zhou
 * Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * HLPLayer.java
 */
public class HLPlayer extends Die {
	private int points = 1000;
	private int riskPoints;
	private String call;
	
	public HLPlayer() {
		
	}
	
	/**
	 * Gameplay Methods
	 */
	
	// Show Points
	public String showPoints() {
		String point = Integer.toString(points);
		return point;
	}
	
	// Risk Points
	public void riskPoints(int riskPoints) {
		this.riskPoints = riskPoints;
	}
	
	// Make call
	public void makeCall(String call) {
		this.call = call;
	}
	
	// Roll Dice
	
	// Show roll
	
	// Show points
	
	
	
}
