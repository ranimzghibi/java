package abstraite;

public class Fiscalite {
    public static void main(String[] args) {
        Personne p1 = new Personne(12345678, "Ranim", "zghibi");
        Personne p2 = new Personne(87654321, "seif", "ben amara");
        Personne p3 = new Personne(11223344, "amani", "zghibi");

        Lotissement lotissement = new Lotissement(10);

        lotissement.ajouter(new proprieteprivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appart(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprietePro(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprietePro(5, p1, "Bir Bouragba", 2500, 400, false));

        lotissement.afficherPropriétés();

        System.out.println("Nombre global des pièces : " + lotissement.getnbPièces());
        proprieteprivee propMoinsImpo=lotissement.minImpots();
        
            System.out.println("Prop : " + propMoinsImpo.getResponsable());
            System.out.println("Montant des impo : " + propMoinsImpo.calculImpot());
        

    	lotissement.supprimerHamm();

        lotissement.afficherPropriétés();

        Lotissement lt = new LotissementPrivee(10);
        
    }}

     class LotissementPrivee extends Lotissement {
     LotissementPrivee(int capacite) {
        super(capacite);
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (p instanceof proprieteprivee) {
            return super.ajouter(p);
        } else {
            return false;
        }
    }

    public proprieteprivee getProprieteByIndice(int i) {
        Propriete p = super.getProprieteByIndice(i);
        if (p instanceof proprieteprivee) {
            return (proprieteprivee) p;
        } else {
            return null;
        }
    }

    @Override
    public int getnbPièces() {
        int total = 0;
        for (int i = 0; i < getNombre(); i++) {
            Propriete p = getProprieteByIndice(i);
            if (p instanceof proprieteprivee) {
                total += ((proprieteprivee) p).getNbPieces();
            }
        }
        return total;
    }
 }
