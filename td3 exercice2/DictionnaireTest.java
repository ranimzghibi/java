package exercice2;

public class DictionnaireTest {

	public static void main(String[] args) {
        Dictionnaire larousse = new Dictionnaire("Larousse",10);
        MotDico m1 = new MotDico("chat", "animal domestique ");
        MotDico m2 = new MotDico("chien", "animal domestique fidèle");
        MotDico m3 = new MotDico("ranim", "est une fille belle");
        larousse.ajouterMot(m1);
        larousse.ajouterMot(m2);
        larousse.ajouterMot(m3);
        larousse.listerDico();
        System.out.println(larousse.chercherMot("chien"));
        System.out.println(larousse.chercherMot("Sami"));
        larousse.supprimerMot("chien");
        System.out.println(larousse.nbSynonymes(m1));
        larousse.listerDico();
	}

}
