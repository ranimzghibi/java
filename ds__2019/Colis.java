package ds_2019;

public class Colis extends Courrier{
	 double poids;
	 double volume;
	Colis(boolean m,String adresse,double poids,double volume){
		super(m,adresse);
		this.poids=poids;
		this.volume=volume;
	}
	void decrire() {
		super.decrire();
		System.out.println(" poids"+poids+" volume"+volume);
	}
	double affranchir() {
		double montant=0;
		montant=0.25*this.volume+this.poids*1.0;
		return montant;
	}
			
}
