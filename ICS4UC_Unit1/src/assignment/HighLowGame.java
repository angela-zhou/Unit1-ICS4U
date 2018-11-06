package assignment;

/**
 * @author Angela Zhou
 * Start Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * HLPLayer.java
 */
import simpleIO.Console;

public class HighLowGame {
	
	/**
	 * Error checking methods
	 */
	public static boolean isValidCall(int call) {
		// Check if user entered a number that is not 0 or 1
		if (call != 0 && call != 1) {
			Console.print(call + " is not a valid call. Please try again.");
			return false;
		} else {
			return true;
		}
	}
	public static boolean isValidSide(int numSides) {
		// Check if user entered a number that is < 2 or > 100
		if (numSides < 2 | numSides > 100) {
			Console.print(numSides + " is not a valid value. Please enter an integer from 2-100");
			return false;
		} else {
			return true;
		}
	}
	public static boolean isValidDice(int numDice) {
		// Check if user entered a number that is < 1
		if (numDice < 1) {
			Console.print(numDice + " is not a valid value. Please enter an integer greater than 1.");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		final int QUIT = -1;
		final int LOW = 0, HIGH = 1;
		HLPlayer player;
		int pointsToRisk, numSides, numDice, call;
		
		do {
			numSides = Console.readInt("How many sides would you like your dice to have?");
		} while (isValidSide(numSides) == false);
		do {
			numDice = Console.readInt("How many dice would you like to have?");
		} while (isValidDice(numDice) == false);
		
		player = new HLPlayer(numSides, numDice);

		// play High or Low game
		Console.print("You have " + player.showPoints() + " points.");
		
		pointsToRisk = Console.readInt("How many points do you want to risk? (" + QUIT + " to quit) ");

		while (pointsToRisk != QUIT) {
		
			player.riskPoints(pointsToRisk);
			
			do {
				call = Console.readInt("Make a call (" + LOW + " for low, " + HIGH + " for high): ");
			} while (isValidCall(call) == false);
			
			player.makeCall(call);
			
			player.rollDice();
			
			Console.print("You rolled "   + player.showRoll());
			Console.print("The roll was " + player.highOrLow());
			Console.print("You now have " + player.showPoints() + " points.");

			pointsToRisk = Console.readInt("How many points do you want to risk? (" + QUIT + " to quit) ");
		}
	}
}