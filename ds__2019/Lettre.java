package ds_2019;

public class Lettre extends Courrier {
		 double poids;
		 String format;
		Lettre(boolean m,String adresse,double poids,String format){
			super(m,adresse);
			this.poids=poids;
			if (format.toUpperCase()=="A3" ||format.toUpperCase()=="A3" )
			this.format=format.toUpperCase();
		}
		void decrire() {
			super.decrire();
			System.out.println("poids"+poids+"format"+format);
		}
		
		double affranchir() {
			double montant=0;
			if (this.format=="A3") {
				montant=3.5+0.5*this.poids;
			}
			else 
				{
				if (this.format=="A4") {
					montant=2.5+0.5*this.poids;
				}
			}
			if (this.mode_expedition==true)
				montant=montant*2;
			return montant;
		}
}
