package abstraite;

public class Villa extends proprieteprivee{
	private boolean avecPiscine;
	Villa (int id,Personne responsable,String adresse,double surface,int nbPieces,boolean p){
		super(id,responsable,adresse,surface,nbPieces);
		this.avecPiscine=p;
	}
	@Override
	public String toString() {
		return super.toString()+"Villa [avecPiscine=" + avecPiscine + "]";
	}
	double calculImpot() {
		if (avecPiscine) {
			return super.calculImpot()+200;
		}
		else 
			return super.calculImpot();
		}
}

