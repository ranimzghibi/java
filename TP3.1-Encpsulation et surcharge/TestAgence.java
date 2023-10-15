package TPP;

public class TestAgence {

	public static void main(String[] args) {
		
		AgenceMobiliere agence=new AgenceMobiliere(10);
		Vehicule v=new Vehicule("Clio", "classique", 2000,20.000);
		Vehicule w=new Vehicule("Mercedes", "Fantome", 2008,60.000);
		Vehicule x=new Vehicule("KIA", "Picanto", 2012,35.000);
		//v.ecrisVehicule();
		//w.ecrisVehicule();
		//x.ecrisVehicule();
		
		agence.ajoutVehicule(v);
		agence.ajoutVehicule(w);
		agence.ajoutVehicule(x);
		
		agence.selection("Mercedes");
		agence.selection(40.000);
		agence.afficheancienne();
		}

}
