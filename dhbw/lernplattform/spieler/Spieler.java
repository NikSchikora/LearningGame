package dhbw.lernplattform.spieler;

public class Spieler {
	
	private String name;
	private int levelzaehler = 1;

	public Spieler(String name) {
		this.name = name;
		
		//Test
		//System.out.println(name);
		
		
	}


	public String getName() {
		return name;
	}



	public int getLevelzaehler() {
		return levelzaehler;
	}


	public void levelgeschafft() {
		levelzaehler++;
	}
	
	public boolean canCompleteLevel(int level){ 
		return this.levelzaehler >= level;
	}
	
}
