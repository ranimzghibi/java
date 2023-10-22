package libraire;

public class Roman extends Livre{
	private String nom_auteur;
	private String nom_editeur;
	Roman(String titre,int identifiant,String domaine,int nbpage,String nom_auteur,String nom_editeur){
		super(titre,identifiant,domaine,nbpage);
		this.nom_auteur=nom_auteur;
		this.nom_editeur=nom_editeur;
	}
	public String toString() {
		return super.toString()+
	"\nnom d auteur :"+this.nom_auteur+"\nnom d editeur :"+this.nom_editeur;
	}
	double calculePrix(){
		double prix;
		prix = (0.05 * nbpage)*(1+tva);
		return prix;
	}
}
