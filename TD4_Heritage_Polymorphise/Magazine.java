package libraire;

public class Magazine extends Livre{
	private String mois_parution;
	Magazine(String titre,int identifiant,String domaine,int nbpage,String mois_parution){
		super(titre,identifiant,domaine,nbpage);
		this.mois_parution=mois_parution;
	}
	public String toString() {
		return super.toString()+
	"\nnom d auteur :"+this.mois_parution;
	}
	double calculePrix(int bonus){
		double prix;
		prix = (0.35 * nbpage)*(1+tva)+bonus;
		return prix;
	}
}
