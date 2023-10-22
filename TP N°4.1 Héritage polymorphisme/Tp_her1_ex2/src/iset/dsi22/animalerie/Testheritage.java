package iset.dsi22.animalerie;

public class Testheritage {

	public static void main(String[] args) {
		Animal tab[]= new Animal [3];
		tab[0]=new Animal("noir",20);
		tab[1]=new Chats("blanc",10,true);
		tab[2]=new Chiens("marron",5,"berger");
		for (int i=0;i<3;i++) {
			
			if (tab[i].getClass().getSimpleName().equals("Animal")) {
				//j ai pas compris pourquoi la double egal ne fontionne pas 
				System.out.println("L'espece de cet animal est inconnue");
			}
			else {
				System.out.println("L'espece de cet animal est :"+tab[i].getClass().getSimpleName());
			}
			tab[i].decrisToi();
			tab[i].manger();
			tab[i].boire();
			tab[i].crier();
			System.out.println(tab[i].getClass().getSimpleName());
			System.out.println("----------------");
		}
	}

}
