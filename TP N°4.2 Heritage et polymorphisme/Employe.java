package exercice1;

public class Employe extends Salaire{
	private double Hsupp;
	private double PHsupp;
	Employe(int matricule, String Nom, double Recrutment,double Hsupp,double PHsupp) {
		super(matricule, Nom, Recrutment);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
	}
	double getHsuppp() {
		return Hsupp;
	}
	double getPHsupp() {
		return PHsupp;
	}
	void setHsupp (double H) {
		this.Hsupp=H;
	}
	void setPHsupp (double P) {
		this.PHsupp=P;
	}
	@Override
	void affiche ()
	{
		System.out.println(this.getClass());
		super.affiche();
		System.out.println("Hsupp :"+Hsupp+"PHsupp :"+PHsupp);
	}
	@Override
	double salaire()
	{
		double s=super.salaire();
		return s+PHsupp*Hsupp;
	}
}
