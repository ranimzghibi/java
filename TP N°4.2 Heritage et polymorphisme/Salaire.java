package exercice1;

public class Salaire {
	protected int matricule;
	protected String Nom;
	protected double Recrutment ;
	Salaire (int matricule,String Nom,double Recrutment){
		this.matricule=matricule;
		this.Nom=Nom;
		this.Recrutment=Recrutment;
	}
	int getMatricule() {
		return this.matricule;
	}
	String getNom() {
		return this.Nom;
	}
	double getRecrutment() {
		return this.Recrutment;
	}
	void setMatricule (int m) {
		this.matricule=m;
	}
	void setNom (String n) {
		this.Nom=n;
	}
	void setRecrutment (double r) {
		this.Recrutment=r;
	}
	void affiche () {
		System.out.println("matricule :"+matricule+"nom:"+Nom+"Recrutment :"+Recrutment);
	}
	double salaire() {
		double s;
		if (this.Recrutment<2005) {
			s=400;
		}
		else s=280;
		return s;
	}

}
