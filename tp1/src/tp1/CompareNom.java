package tp1;

import java.util.Comparator;

public class CompareNom implements Comparator<Etudiant>{
	public int compare(Etudiant e1, Etudiant e2) {
        return e1.nom.compareTo(e2.nom);
    }

}
