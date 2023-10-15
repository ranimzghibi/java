package TPP;

public class AgenceMobiliere {
	private Vehicule[] tab;
	private int max;
	private int nb=0;
	AgenceMobiliere(int max){
		this.max=max;
		this.tab=new Vehicule[max];
	}
	void ajoutVehicule(Vehicule v) {
		if (nb<max) {
			tab[nb]=v;
			nb++;
		}
		else System.out.println("il n ya pas de place");
	}
	 void selection(int n) {
		 if (n<nb) {
			 tab[n].ecrisVehicule();
		 }
		 else System.out.println("cette case n existe pas");
	 }
	 void selection(String mq) {
		 boolean Test=false;
		 for (int i=0;i<nb;i++) {
			 if (tab[i].getMarque()==mq) {
				 tab[i].ecrisVehicule();
				 Test=true;
			 }
		 }
		 if (Test==false) {
			 System.out.println("il n ya pas des article de cette marque");
		 }
	 }
	 void selection(double px){
		 boolean Test=false;
		 for (int i=0;i<nb;i++) {
			 if (tab[i].getPrix()<px) {
				 tab[i].ecrisVehicule();
				 Test=true;
			 }
		 }
		 if (Test==false) {
			 System.out.println("il n’y a pas de véhicules dans cette marge de prix");
		 }
	 }
	 void afficheancienne(){
		 int max=tab[0].getAnnee();
		 for (int i=0;i<nb;i++) {
			 if(tab[i].getAnnee()<max) {
				 max=tab[i].getAnnee();
			 }
		}
		System.out.println(max);
			}
	 }
