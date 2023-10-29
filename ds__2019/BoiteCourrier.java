package ds_2019;

public class BoiteCourrier {
	Courrier[]tab;
	
	BoiteCourrier(int n){
		 tab=new Courrier [n];
	}
	 double affranchir() {
		double montant=0;
		 for (int i=0;i<tab.length;i++) {
			montant=montant+tab[i].affranchir();
		}
		 return montant;
	}
	 int courriersInvalides() {
		 int count=0;
		 for (int i=0;i<tab.length;i++) {
				if (tab[i].estValide()==false)
					count++;
			}
		 return count;
	 }
	 void affiche() {
		 for (int i=0;i<tab.length;i++) {
			 tab[i].decrire();
			 if (tab[i].estValide()==false) {
				 System.out.println("cette corrier est invalide!!");
			 }
			 
		 }
	 }

}
