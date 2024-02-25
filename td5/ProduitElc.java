package td5;

public class ProduitElc extends Article implements Promotion{
	private String categorie;
	ProduitElc(long ref, String lib, float prixHt, int q, String c){
		super(ref,  lib,  prixHt,  q);
		if (c=="électroménager" || c=="TV" || c=="téléphones" || c=="ordinateurs") {
			this.categorie=c;
		}
		else return ;
		
	}

	@Override
	float calculPrixTTC() {
		return (float) (prixHt*(1.08+tva));
	}
	void decrire() {
		super.decrire();
		System.out.println("categorie"+this.categorie);
	}

	@Override
	public double prixDeVente(String dateStr) {
		 if (estPeriodePromo(dateStr)) {
	            return calculPrixTTC() * 0.8f;
	        } 
	        return calculPrixTTC();
		
	}
	
}
