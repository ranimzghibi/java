package exercice2;

public class Dictionnaire {
	private int nbMots;
	private MotDico[] dico;
	private String nom;
	Dictionnaire(String nom,int taille) {
		this.nom=nom;
		nbMots=0;
		this.dico=new MotDico [taille];
		
	}
	 public void ajouterMot(MotDico m) {
	        if (nbMots < dico.length) {
	            dico[nbMots] = m;
	        }
	        nbMots++;
	    }
	void supprimerMot (String ch) {
		for(int i=0;i<nbMots;i++) {
			if (dico[i].getMot()==ch) {
				for( int j=i;j<nbMots-1;j++)
					dico[j]=dico[j+1];
				dico[nbMots - 1] = null;
	            nbMots--;
				break;
			}	
		}
		
	}
	int chercherMot (String ch) {
		int test=-1;
		for(int i=0;i<nbMots;i++) {
			if (dico[i].getMot()==ch)
				test=i;
		}
		return test;
	}
	void listerDico () {
		for(int i=0;i<nbMots;i++) {
			System.out.println("la mot"+i+":"+dico[i].getMot()+"\nla definition :"+dico[i].getDéfinition());
		}
	}
	int nbSynonymes (MotDico m) {
		int count=0;
		for(int i=0;i<nbMots;i++) {
			if (dico[i].getDéfinition()==m.getDéfinition())
				count++;
		}
		return count;
	}
}
