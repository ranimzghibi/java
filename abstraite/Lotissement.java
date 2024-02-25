package abstraite;

public class Lotissement implements GestionPropriete{
	protected Propriete [] tabProp;
	protected int nombre;
	Lotissement(int capacite){
		if (capacite<MAX_PROPRIETES) {
			tabProp=new Propriete[capacite];
		}
	}
	public Propriete getProprieteByIndice(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        } else {
            return null;
        }
    }
	int getnbPièces()
	{
		int k=0;
		for(int i=0;i<tabProp.length;i++) {
			if (tabProp[i] instanceof proprieteprivee) {
				
				k+=((proprieteprivee) tabProp[i]).getNbPieces();
			}
	}
		return k;
		}
	
	
	
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	@Override
	public void afficherPropriétés() {
		for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i]);
        }
		
	}
	@Override
    public boolean ajouter(Propriete p) {
        if (nombre < MAX_PROPRIETES) {
            tabProp[nombre] = p;
            nombre++;
            return true;
        } else {
            return false;
        }
    }
	
	 @Override
	    public boolean supprimer(Propriete p) {
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i].equals(p)) {
	                for (int j = i; j < nombre - 1; j++) {
	                    tabProp[j] = tabProp[j + 1];
	                }
	                nombre--;
	                return true;
	            }
	        }
	        return false;
	    }	
	 proprieteprivee minImpots() {
		 proprieteprivee propMoinsImpo = null;
	        
	        int j=0;
	        while (j<this.getNombre() && !(this.getProprieteByIndice(j) instanceof proprieteprivee)) {
	        	j++;
	        }
	        if (this.getProprieteByIndice(j) instanceof proprieteprivee) {
	        	double minImpots = this.getProprieteByIndice(j).calculImpot();
	        
	        for (int i = 0; i < this.getNombre(); i++) {
	            Propriete p = this.getProprieteByIndice(i);
	            if (p instanceof proprieteprivee) {
	                double impots = p.calculImpot();
	                if (impots < minImpots) {
	                    minImpots = impots;
	                    propMoinsImpo = (proprieteprivee) p;
	                }
	            }
	        }
	        }
	        return propMoinsImpo;
	        
	 }
	 void supprimerHamm(){
		 Propriete appartementHammamet = null;
	        for (int i = 0; i < this.getNombre(); i++) {
	            Propriete p = this.getProprieteByIndice(i);
	            if (p instanceof Appart && p.getAdresse().equals("Hammamet")) {
	                appartementHammamet = p;
	                break;
	            }
	        }

	        if (appartementHammamet != null) {
	            this.supprimer(appartementHammamet);
	        }
	 }
}
