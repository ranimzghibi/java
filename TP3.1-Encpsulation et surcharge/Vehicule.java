package TPP;

public class Vehicule {
	private int num;
	private String marque;
	private String modele;
	private int annee_creation;
	private double prix;
	private static int count=0;
	Vehicule(String marque, String modele, int annee, double prix){
		count++;
		num=count;
		this.marque=marque;
		this.modele=modele;
		this.annee_creation=annee;
		this.prix=prix;
	}
	void ecrisVehicule() {
		System.out.println("le num:"+num+"\nla marque:"+marque+"\nle modele:"+modele+"\n le prix:"+prix);
	}
	String getMarque() {
		return this.marque;
	}
	String getModele() {
		return this.modele;
	}
	double getPrix() {
		return this.prix;
	}
	public void setMarque(String marque) {
		this.marque=marque;
	}
	public void setModele(String modele) {
		this.modele=modele;
	}
	public void setPrix(double prix) {
		this.prix=prix;
	}
	int getCount() {
		return this.count;
		}
	int getAnnee() {
		return this.annee_creation;
		}
	
	

}
