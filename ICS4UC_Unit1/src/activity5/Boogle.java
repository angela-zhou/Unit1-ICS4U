package activity5;

public class Boogle {
	private String name; 
	private int happiness  = 50;
	private int tiredness  = 0;
	private int hunger     = 0;
	private int energy     = 0;
	
	public Boogle() {
		setName("Arnold");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String feed(String food, int happiness, int energy) {
		
		return "Yum, that was a delicious " + food + "!";
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
