package abstraite;

public interface GestionPropriete {
	 public static final int MAX_PROPRIETES = 100;
	void afficherPropriétés();
	boolean ajouter(Propriete p);
	boolean supprimer(Propriete p);
	
	
}
