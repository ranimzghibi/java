package exercice;
public class CalculMoyenne {

	public static void main(String[] args) {
		int nb=2;
		float add[]=new float [nb];
		float modif[]=new float [nb];
		System.out.println("enter les note de conrole");
		float noteCtrl []=new float [nb];
		float noteExam []=new float [nb];
		Eercice.remplir(noteCtrl);
		System.out.println("enter les note de examen");
		Eercice.remplir(noteExam);
		System.out.println("*********Voici la liste des note de conrole******");
		Eercice.lister(noteCtrl);
		System.out.println("*********Voici la liste des note de l examen******");
		Eercice.lister(noteExam);
		Eercice.produit(2, noteExam);
		add=Eercice.additionner(noteExam,noteCtrl);
		Eercice.div(3,add);
		System.out.println("*********Voici la liste des moyenne******");
		Eercice.lister(add);
		float moyenne_classe=Eercice.somme_element(add);
		moyenne_classe=moyenne_classe/nb;
		System.out.println("la moyenne de classe est :"+moyenne_classe);
		modif=Eercice.additionner(1,noteCtrl);
		System.out.println("*********Voici la liste des note de conrole apres la modifications******");
		Eercice.lister(modif);
		
		

	}

}
