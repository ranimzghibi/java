package abstraite;

public class proprieteprivee extends Propriete{
	private int nbPieces;
	public int getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	proprieteprivee(int id,Personne responsable,String adresse,double surface,int nbPieces){
		super(id,responsable,adresse,surface);
		this.nbPieces=nbPieces;
	}
	@Override
	public String toString() {
		
		return super.toString()+"proprieteprivee [nbPieces=" + nbPieces + "]";
	}
	@Override
	double calculImpot() {
		return 50/this.surface+10/this.nbPieces;
	}
}
