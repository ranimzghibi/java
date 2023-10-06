package Td1;

public class Exercice1 {

	public static void main(String[] args) {
		Livre l1=new Livre("ali","titre1");
		Livre l2=new Livre("sami","titre2");
		if (l1.getauteur() == l2.getauteur())
			System.out.println("les deux livre ont le meme auteur");
		else 
			System.out.println("les deux livre sont d auteur differant");
		Livre[] livres= new Livre[3];
		livres[0] = new Livre("Coelho", "l'alchimiste",225);
        livres[1] = new Livre("le Coran",508);
        livres[2] = new Livre("JK Rowling", "Harry Potter");
        livres[1].setauteur("Paulo Coelho");
        livres[2].setNbPages(461);
        livres[0].decrire();
        livres[1].decrire();
        livres[2].decrire();
        //*******exercice3******************
        System.out.println(livres[1].testPrix());
        livres[2] = new Livre("JK Rowling", "Harry Potter",225,22.2);
        livres[2].decrire();
        livres[2].setprix(54.0);
}
	}
