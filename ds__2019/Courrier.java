package ds_2019;

public class Courrier {
		protected boolean mode_expedition;
		protected String adresse;
		protected final double  tarif=0.5;
		Courrier(boolean m,String adresse){
			this.mode_expedition=m;
			this.adresse=adresse;
		}
		boolean estValide(){
			if (this.adresse==null&& !this.adresse.isEmpty())
				return false;
			else
				return true;
		}
		void decrire () {
			System.out.println("mode de expedition :     "+mode_expedition+"   adresse    "+adresse+"   tarif    "+tarif);
		}
		double affranchir() {
			double montant=0;
			if (estValide()==false)
				return montant;
			else {
				if (this.mode_expedition==false)
					montant=this.tarif;
				else
					montant=this.tarif*2;
				return montant;
			}
			
		}
		
		
}
