package tp3;

public class Compte {
	private static int i=0;
	private int num=0;
	private Personne titulaire;
	private int solde;
	private int decouvertMax;
	private int debitMax ;
	Compte (Personne titulaire){
		i++;
		num=i;
		solde=0;
		decouvertMax=800;
		debitMax=1000;
		this.titulaire=titulaire;
	}
	Compte (Personne titulaire, int solde,int decouvertMax,int debitMax){
		i++;
		num=i;
		this.solde=solde;
		this.decouvertMax=decouvertMax;
		this.debitMax=debitMax;
		this.titulaire=titulaire;
	}
	public String toString() {
		return "le numero de compte:"+num+"\n+++++++personne++++++\n"+titulaire.toString()+"\nsolde: "+solde+"\ndecouvert_Max: "+decouvertMax+"\ndebit_max: "+debitMax ;
	}
	Personne getTitulaire (){
		return titulaire;
	}
	 int getSolde () {
		return solde;
	}
	int getDecouvertMax () {
		return decouvertMax;
	}
	int getDebitMax () {
		return debitMax;
	}
	int getNum () {
		return num;
	}
	void crediter(int montant) {
		if (montant>0)
			this.solde+=montant;
	}
	void debiter(int montant) {
		if ((this.solde-montant)>(this.decouvertMax)) {
			this.solde-=montant;
		}		
	}
	boolean retrait (int montant) {
		if (montant<this.debitMax) {
			debiter(montant);
			return true;
		}
		else return false;
	}
	boolean adecouvert() {
		if (this.solde<0)
			return true;
		else
			return false;
		
	}
	int MontantDécouvert() {
		int montant;
		if (this.adecouvert()==true) 
			montant=Math.abs(this.solde);
		else
			montant=0;
			return montant;
	}
	void virement (Compte c,int m) {
		if (this.retrait(m)==true) {
			c.crediter(m);
		}
	}
	void virement(Compte c,Compte c1,int m) {
		if (c1.retrait(m)==true) {
			c.crediter(m);
		}
	}

	
}
