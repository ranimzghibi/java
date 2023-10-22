package libraire;

public class TestLibrairie {

	public static void main(String[] args) {
		Librairie L = new Librairie(6);
		Livre lv1 = new Livre("la vie en rose",1,"domaine1",200);
		Roman lv2 = new Roman("L'Étranger", 201, "Littérature Française", 123, "Albert Camus", "Gallimard");
		Magazine lv3 = new Magazine("Voyages du Monde", 101, "Tourisme et Aventures", 64, "Avril 2023");
		System.out.println(lv3.calculePrix(10)); 
		System.out.println(lv3.toString());

		L.ajoutLiv(lv1);
		L.ajoutLiv(lv2);
		L.ajoutLiv(lv3);
		Roman lv4 = new Roman("Guerre et Paix", 202, "Littérature Russe", 1225, "Léon Tolstoï", "Littérature Classique");
		L.ajoutLiv(lv4);
		L.inventaire("Roman");
		System.out.println("Prix tous les Roman = ");
		System.out.println(L.prix("Roman"));
		Roman lv5 = new Roman("Le Petit Prince", 203, "Littérature pour Enfants", 96, "Antoine de Saint-Exupéry", "Gallimard");
		L.ajoutLiv(lv5);
		L.suppLiv(3);
		L.ajoutLiv(lv5);
		L.inventaire();
	}

}
