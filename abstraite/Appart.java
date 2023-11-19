package abstraite;

public class Appart extends proprieteprivee{
	private int numEtage;
	Appart (int id,Personne responsable,String adresse,double surface,int nbPieces,int e){
		super(id,responsable,adresse,surface,nbPieces);
		this.numEtage=e;
	}
	@Override
	public String toString() {
		return super.toString()+"Appart [numEtage=" + numEtage + "]";
	}

}
