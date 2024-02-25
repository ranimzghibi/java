package libraire;

public class Librairie {
	private int cap;
	private Livre[] list;
	private int nb=0;
	Librairie(int c) {
	    list = new Livre[c];
	    cap = c;
	}

	int getNb() {
		return nb;
	}
	void inventaire() {
	    for (int i = 0; i < nb; i++) {
	        if (list[i] != null) {
	            System.out.println(list[i] + " le prix: " + list[i].calculePrix());
	            System.out.println("********************************************************************************");
	        }
	    }
	}

	void inventaire(String categ) {
		for (int i=0;i<nb;i++) {
			if (list[i].getClass().getName().equals(categ)) {
				System.out.println(list[i]);
				}
		}	
	}
	void ajoutLiv(Livre liv) {
		if (nb<cap){
			list[nb]=liv;
			nb++;
		}
	}
	void suppLiv(int num) {
		int i=0;
		while(i<nb && list[i].getId ()!=num) {
			i++;
		}
		if(i<nb) {
	        for(int j=i;j<(nb-1);j++) {
	            list[j] = list[j+1];
	        }
	        nb -= 1;
	    } else {
	        System.out.println("il y as pas de livre de cette id!");
	    }
	}
	double prix(String categ) {
		double s = 0;
		for(int i=0;i<nb;i++) {
			if(list[i].getClass().getSimpleName().equals(categ)) {
				s += list[i].calculePrix();
			}
		}
		return s;
	}
}
