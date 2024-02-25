package abstraite;

public class ProprietePro extends Propriete{
	private int nbEmpl;
	private boolean estEtatique;
	ProprietePro(int id,Personne responsable,String adresse,double surface,int nbEmpl,boolean estEtatique){
		super(id,responsable,adresse,surface);
		this.nbEmpl=nbEmpl;
		this.estEtatique=estEtatique;
	}
	@Override
	public String toString() {
		return super.toString()+"ProprietePro [nbEmpl=" + nbEmpl + ", estEtatique=" + estEtatique + "]";
	}
	@Override
	double calculImpot() {
		if (estEtatique) {
			return 0;
		}
		else {
			return 100/super.surface+30/this.nbEmpl;
		}
	}
	
}
