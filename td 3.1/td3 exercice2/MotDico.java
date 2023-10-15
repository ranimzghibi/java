package exercice2;

public class MotDico {
	private int num;
	private static int count=0;
	private String mot;
	private String definition;
	public MotDico(String mot, String definition) {
        count++;
		this.num =count;
        this.mot = mot;
        this.definition = definition;
    }
	String getMot ()
	{
		return mot;
	}
	String getDéfinition () {
		return definition;
	}
	void setDéfintion (String s) {
		this.definition=s;
	}
	void setMot (String s) {
		this.mot=s;
	}
	boolean synonyme (MotDico m) {
		return (this.definition==m.definition);
	}
	
}
