package exercice1;

public class Vendeur extends  Salaire{
	private double pourcentage;
	private double vente;
	Vendeur(int matricule, String Nom, double Recrutment,double vente,double pourcentage){
		super(matricule, Nom, Recrutment);
		this.vente=vente;
		this.pourcentage=pourcentage;
	}
	double getVente(){
		return vente;
	}
	double getPourcentage(){
		return pourcentage;
	}
	void setVente(double vente) {
		this.vente=vente;
	}
	void setPourcentage(double pourcentage) {
		this.pourcentage=pourcentage;
	}
	void affiche ()
	{
		System.out.println(this.getClass());
		super.affiche();
		System.out.println("vente :"+vente+"Pourcentage:"+pourcentage);
	}
	double salaire()
	{
		double s=super.salaire();
		return s+vente*pourcentage;
	}
}
