package activity5;

public class Boogle {
	private String name; 
	private int happiness = 50;
	
	public Boogle() {
		setName("Fluffy");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String feed(String foodType, int energy) {
		happiness += energy;
		return "Yum, that was a delicious " + foodType + "!"
				+ "\nHappiness Level: " + happiness; 
	}
	
	public String play(String game, int energy) {
		happiness += energy;
		return "I love playing " + game + "!"
				+ "\nHappiness Level: " + happiness;
	}
	
}
