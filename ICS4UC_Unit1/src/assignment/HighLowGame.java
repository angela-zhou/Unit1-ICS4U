package assignment;

/**
 * @author Angela Zhou
 * Date: Oct 15th, 2018
 * Course: ICS4U
 * Teacher: Mrs. Spindler
 * HighLowGame.java
 */
import simpleIO.Console;

public class HighLowGame {

	public static void main(String[] args) {
		
//		int highNum = findMax(a, b);
//	    int lowNum = findMin(a, b);
//	    int range = highNum - lowNum + 1;
//	    return (int) (Math.random() * range) + lowNum;

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
			} while (call != LOW && call != HIGH);
			
			player.makeCall(call);
			
			player.rollDice();
			
			Console.print("You rolled: " + player.showRoll());
			Console.print("You now have " + player.showPoints() + " points.");

			pointsToRisk = Console.readInt("How many points do you want to risk? (" + QUIT + " to quit) ");
		}
	}
}
