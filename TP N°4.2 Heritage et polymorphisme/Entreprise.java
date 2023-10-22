package exercice1;

public class Entreprise {

	public static void main(String[] args) {
		Salaire tab[]= new Salaire [5];
		tab[0]=new Employe(12345,"Walid",2002,15,4);
		tab[1]=new Vendeur(23445,"Yessine",2007,1000,0.1);
		tab[2]=new Vendeur(65478,"Nassime",2000,700,0.1);
		tab[3]=new Employe(87698,"Aymen ",2003,19,5);
		tab[4]=new Employe(12345,"Khaled",2008,7,4);
		System.out.println("******************************** Liste des Employes*****************************");
		for (int i=0;i<5;i++){
			if (tab[i]instanceof Employe)
				tab[i].affiche();
		}
		System.out.println("******************************** Liste des Vendeurs*****************************");
		for (int i=0;i<5;i++){
			if (tab[i]instanceof Vendeur)
				tab[i].affiche();
		}
		System.out.println("******************************** * Nom du salarié le plus ancien dans l'entreprise*****************************");
		double a=tab[0].Recrutment;
		String n=tab[0].Nom;
		for (int i=0;i<5;i++){
			if (tab[i].Recrutment<a) {
				a=tab[i].Recrutment;
				n=tab[i].Nom;
			}
		}
		System.out.println(n);
		System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
		Salaire s=null;
		double m=tab[0].matricule;
		for (int i=0;i<5;i++){
			if (tab[i]instanceof Vendeur) {
				if (s==null) {
					s=tab[i];
				}
				if (tab[i].salaire()<a) {
					s=tab[i];
				}
			}
			
		}
		System.out.println("matricule= "+s.matricule+" de salaire "+s.salaire()+"dt");
	}

}
