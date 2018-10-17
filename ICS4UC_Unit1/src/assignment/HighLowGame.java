package assignment;

import simpleIO.Console;

public class HighLowGame {
	
	public static boolean isValidNumber (int call) {
		// Check if user entered a number that is not 0 or 1
		if (call != 0 && call != 1) {
			Console.print(call + " is not a valid value. Please try again.");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		final int QUIT = -1;
		final int LOW = 0, HIGH = 1;
		HLPlayer player = new HLPlayer();
		int pointsToRisk, call;

		/* play High or Low game */
		Console.print("You have " + player.showPoints() + " points.");
		
		pointsToRisk = Console.readInt("How many points do you want to risk? (" + QUIT + " to quit) ");

		while (pointsToRisk != QUIT) {
		
			player.riskPoints(pointsToRisk);
			
			do {
				call = Console.readInt("Make a call (" + LOW + " for low, " + HIGH + " for high): ");
			} while (isValidNumber(call) == false);
			
			player.makeCall(call);
			
			player.rollDice();
			
			Console.print("You rolled: " + player.showRoll());
			Console.print("You now have " + player.showPoints() + " points.");

			pointsToRisk = Console.readInt("How many points do you want to risk? (" + QUIT + " to quit) ");
		}
	}
}