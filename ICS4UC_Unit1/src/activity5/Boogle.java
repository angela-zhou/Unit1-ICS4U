package activity5;

public class Boogle {
	private String name;
	private String prompt;
	private int happiness  = 0;
	private int tiredness  = 10;
	
	public Boogle() {
		setName("Arnold");
		setPrompt("Try and make me happy!" + "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness);
	}

	/**
	 * Getters and setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	/**
	 * Boogle interaction methods
	 */
	public String feed(String food, int energy) {
		happiness += energy;
		tiredness -= energy;
		return "Yum, that was a delicious " + food + "!"
				+ "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness;
	}
	
	public String sleep(String bed, int energy) {
		happiness += energy;
		tiredness -= energy;
		return "The " + bed + " is very comfortable!"
				+ "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness;
	}
	
	public String play(String game, int hunger) {
		tiredness += hunger;
		return "I love playing " + game + "!"
				+ "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness;
	}
	
	public String walk(String place, int hunger) {
		tiredness += hunger;
		return "I want to go for a walk in " + place + "!"
				+ "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness;
	}
	
	public String groom(String groom, int energy) {
		happiness += energy;
		return groom + " are the best!"
				+ "\nHappiness Level: " + happiness + "\nTiredness Level: " + tiredness;
	}	
}
