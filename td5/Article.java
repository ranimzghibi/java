package td5;

public abstract class Article {
	protected long reference ;
	protected String libelle;
	protected float prixHt;
	protected int qteStock=0;
	protected float tva=0.1f; 
	public float getPrixHt() {
		return prixHt;
	}
	public void setPrixHt(float prixHt) {
		this.prixHt = prixHt;
	}
	Article(long ref, String lib, float p, int q){
		this.reference=ref;
		this.libelle=lib;
		this.prixHt=p;
		this.qteStock=q;
	}
	void approvisionner(int nb) {
		this.qteStock+=nb;
	}
	void decrire() {
		System.out.println("la referance :"+reference+" \n libelle"+libelle);
	}
	abstract float calculPrixTTC();
	boolean appartientPromo() {
		if (this instanceof Vetement || this instanceof ProduitElc) {
			return true;
		}
		else return false;
	}
	
	boolean estDispo(int qteAchat) {
		if(qteAchat <= this.qteStock)
			return true;
		else 
			return false;
	}
	protected abstract double prixDeVente(String dateAchat);
}
