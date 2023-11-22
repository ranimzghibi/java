package td5;

public class Vetement extends ProduitGC implements Promotion{
	private String couleur;
	private int taille;
	 Vetement(long ref, String lib, float prixHt, int q,String c,int taille){
		super(ref,  lib,  prixHt,  q);
		this.couleur=c;
		this.taille=taille;
	}
	
	void decrire() {
		super.decrire();
		System.out.println("couleur"+this.couleur+"\n taille:"+this.taille);
	}
	@Override
	public double prixDeVente(String dateStr) {
		 if (estPeriodePromo(dateStr)) {
	            return calculPrixTTC() * 0.7f;
	        } 
	        return calculPrixTTC();
	}
}
