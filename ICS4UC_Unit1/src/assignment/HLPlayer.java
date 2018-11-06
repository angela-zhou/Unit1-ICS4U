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
	// user inputted var
	private int riskPoints;
	private int call;
	private int rollSum;
	private int numSides;
	private int numDice;
	
	// Initialize array
	Die[] dice;

	public HLPlayer() {

	}

	public HLPlayer(int numOfSides, int numOfDice) {
		setNumSides(numOfSides);
		setNumDice(numOfDice);
		
		dice = new Die[numDice];

		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Die(numOfSides);
		}
	}

	/**
	 * Gameplay Methods
	 */
	public String showPoints() {
		if (call == LOW && highOrLow() == "low") { // if call is low and user called correctly
			points += riskPoints * 2;
		} else if (call == HIGH && highOrLow() == "high") { // otherwise user loses risk points
			points += riskPoints * 2;
		} else { // otherwise user loses risk points
			points -= riskPoints;
		}
		// convert back to string to show the user
		String point = Integer.toString(points);
		return point;
	}

	public String highOrLow() {
		String result;
		
		int x = Die.LOWEST_NUM * numDice; // lowest possible roll 
		int y = numSides * numDice; 	  // highest possible roll
		int z = x + y; 
		int a;                            // to hold upper bound of low range
		int b;                            // to hold lower bound of high range
		
		if (z % 2 == 0) { // if z is even
			int mid = z / 2;
			a = mid - 1;
			b = mid + 1;
		} else { // if z is odd
			double mid = z / 2.0;
			a = (int) Math.floor(mid);
			b = (int) Math.ceil(mid);
		}
	
		if (rollSum >= x && rollSum <= a) {
			result = "low";
		} else if (rollSum >= b && rollSum <= y) {
			result = "high";
		} else {
			result = "neither high nor low";
		}
		return result;
	}
	
	/**
	 * Roll Dice
	 */
	public void rollDice() {
		rollSum = 0;
		int j = dice.length;
		for (int i = 0; i < dice.length; i++) {
			int k = dice[i].roll();
			rollSum += k;
		}
	}

	/**
	 * Show Roll
	 */
	public String showRoll() {
		// convert to string to show the user
		String rollString = Integer.toString(rollSum);
		return rollString;
	}

	/**
	 * Setter for Risk Points
	 */
	public void riskPoints(int riskPoints) {
		// risk points are ALWAYS positive
		if (riskPoints < 0) {
			riskPoints *= -1;
		}
		this.riskPoints = riskPoints;
	}
	
	/**
	 * Setter for Call
	 */
	public void makeCall(int call) {
		this.call = call;
	}

	/**
	 * Setter for NumSides
	 */
	public void setNumSides(int numOfSides) {
		numSides = numOfSides;
	}
	
	/**
	 * Setter for NumDice
	 */
	public void setNumDice(int numOfDice) {
		numDice = numOfDice;
	}
}
