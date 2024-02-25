package abstraite;

abstract public class Propriete {
	public int getId() {
		return id;
	}
	public Personne getResponsable() {
		return responsable;
	}
	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setId(int id) {
		this.id = id;
	}
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	Propriete(int id,Personne responsable,String adresse,double surface){
		this.id=id;
		this.responsable=responsable;
		this.adresse=adresse;
		this.surface=surface;
		
	}
	public String toString()
	{
		return "id"+id+"personne :"+responsable+"adresse :"+adresse+" surface :"+surface;
	}
	abstract double calculImpot();
}
