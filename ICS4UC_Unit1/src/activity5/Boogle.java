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
	
	public String feed(String foodType, int energy) {
		happy += energy;
		return "Yum, that was a delicious " + foodType + "!"
				+ "\nHappiness Level: " + happy; 
	}
	
	public String play(String game) {
		return game + " is my favourite game!";
	}
	
}
