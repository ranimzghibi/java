package tp3;

public class Personne {
	private String nom="";
	private String prenom="";
	private String adresse;
	Personne(String adresse){
		this.adresse=adresse;	
	}
	Personne (String nom,String prenom ,String adresse){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
	}
	public String toString() {
		return "le nom: "+nom+"\nle prenom: "+prenom+"\nl'adresse: "+adresse;
	}
	String getNom(){
		return nom;
	}
	String getPrenom(){
		return prenom;
	}
	String getAdresse(){
		return adresse;
	}
	

}
