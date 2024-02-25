package libraire;

public class Livre {
	protected String titre;
	protected int identifiant;
	protected static double tva=0.1;
	protected String domaine;
	protected int nbpage;
	Livre(String titre,int identifiant,String domaine,int nbpage){
		this.titre=titre;
		this.identifiant=identifiant;
		this.domaine=domaine;
		this.nbpage=nbpage;
	}
	public String toString() {
		return "titre :"+this.titre+"\nidentifiant :"+this.identifiant+"\ndomaine:"+this.domaine;
	}
	double calculePrix() {
		double prix;
		prix = (0.075 * nbpage)*(1+tva);
		return prix;
	}
	int getId () {
		return this.identifiant;
	}
}
