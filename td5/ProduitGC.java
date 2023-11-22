package td5;

public class ProduitGC extends Article {
	ProduitGC(long ref, String lib, float prixHt, int q){
		super(ref,  lib,  prixHt,  q);
	}
	
	@Override
	float calculPrixTTC() {
		return prixHt*(1+tva);
	}
	@Override
	void decrire() {
		super.decrire();
		System.out.println("prixTTC"+this.calculPrixTTC());
	}

	@Override
	protected double prixDeVente(String dateAchat) {
		// TODO Auto-generated method stub
		return this.prixHt;
	}

	

	
	

	
	
}
