package Td1;

public class Livre {
	private String titre; 
	private String auteur;
	private float nbPages ;
	private double prix; //appartient exercice3
	private Boolean prixFixe=false;
	public Livre(String auteur,String titre) {
	this.auteur = auteur; 
	this.titre = titre;
	}
	public Livre() {
		nbPages=0;
	}
	public Livre(String titre, float nbPages){
		this.nbPages = nbPages; 
		this.titre = titre;
	}
	public Livre(String auteur,String titre, float nbPages){
		this.nbPages = nbPages; 
		this.titre = titre;
		this.auteur = auteur;
	}	
	public String getauteur() { 
		return auteur;
		}
	public String gettitre() { 
		return titre;
		}
	public float getnbpages() { 
		return nbPages ;
		}
	public void setNbPages(float nb) { 
		if (nb>20)
			this.nbPages = nb;
		else
			System.out.println("le nombre indiqué est faible.");
	}
	public void setauteur (String auteur) {
		this.auteur=auteur;
	}
	public void settitre (String titre) {
		this.titre=titre;
	}
	public String toString() {
		return "le livre intitulee "+titre+"de "+auteur+",contenant "+nbPages+" pages"+" le prix :"+prix;
	}
	void decrire () {
		System.out.println(toString());
	}
	//*****exercice 3**************************************
	public double getprix() {
		return prix;
	}
	public void setprix(double prix) {
		System.out.println("le prix est deja fixee");
		this.prix=this.prix;
	}
	public Livre(String auteur,String titre, float nbPages,double prix){
		this.nbPages = nbPages; 
		this.titre = titre;
		this.auteur = auteur;
		this.prix=prix;
		this.prixFixe=true;
	}
	Boolean testPrix() {
		if (this.prix>0.0)
			return true;
		else
			return false;
	}
	

}
