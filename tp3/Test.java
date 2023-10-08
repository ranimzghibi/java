package tp3;

public class Test {

	public static void main(String[] args) {
		    int n = 3; 
	        Compte[] T = new Compte[n];
	        Personne titulaire1 = new Personne("ranim", "zghibi", "Rue1234");
	        Personne titulaire2 = new Personne("alex", "benoui", "Rue 147");
	        Personne titulaire3 = new Personne("sami", "boujmaa", "Rue789");
	        T[0] = new Compte(titulaire1, 1000, 500, 200);
	        T[1] = new Compte(titulaire2, 1500, 800, 250);
	        T[2] = new Compte(titulaire3, 2000, 1000,300);
	        System.out.println("       ********Details des comptes*******");
	        System.out.println("____________________");
	        for (Compte compte : T) {
	            System.out.println(compte);
	            System.out.println("____________________");
	        }
	        System.out.println("**********les comptes avant et apres le virement de 100dt**********");
	        int m=100;
	        System.out.println(T[0].getSolde()+"----"+T[1].getSolde());
	        T[0].virement(T[0],T[1],m);
	        System.out.println(T[0].getSolde()+"----"+T[1].getSolde());
	        System.out.println("********************");
	        int SoldeMax=T[0].getSolde();
	        Compte compteSoldeMax=T[0];
	        for (Compte compte : T) {
	        	if (compte.getSolde()>SoldeMax) {
	        		SoldeMax=compte.getSolde();
	        		compteSoldeMax = compte;
	        		}
	        }
	        System.out.println("_________________________");
	        System.out.println("\nInformations du proprietaire du compte avec le solde le plus elevee :\n"+compteSoldeMax);
	}
	}


