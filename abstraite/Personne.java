package abstraite;

public class Personne {
	private int cin;
	private String nom;
	private String prenom;
	Personne (int c,String n,String p){
		this.cin=c;
		this.nom=n;
		this.prenom=p;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String toString() {
		return "cin :"+cin+" nom :"+nom+" prenom :"+prenom;
	}
	
}
