package activity5;

public class Boogle {
	private String name; 
	private int happy  = 50;
	private int sad    = 0;
	private int hungry = 10;
	
	public Boogle() {
		setName("Arnold");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String feed(String food, int energy) {
		happy += energy;
		return "Yum, that was a delicious " + food + "!"
				+ "\nHappiness Level: " + happy; 
	}
	
	public String play(String game) {
		return "I love playing " + game;
	}
	
	public String walk(String place) {
		return "I want to go for a walk in " + place;
	}
	
	public String groom(String groom) {
		return groom + " are the best!";
	}
	
	public String sleep(String bed) {
		return "The " + bed + " is very comfortable!";
	}
	
}
