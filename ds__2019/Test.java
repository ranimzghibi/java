package ds_2019;

public class Test {

	public static void main(String[] args) {
		Courrier c1= new Courrier(true,"rue12");
		System.out.println(c1.estValide());
		c1.decrire ();
		System.out.println(c1.affranchir());
		Lettre l1= new Lettre(false,"rie147",10.2,"A3");
		System.out.println(l1.estValide());
		l1.decrire ();
		System.out.println(l1.affranchir());
		BoiteCourrier b1=new BoiteCourrier(2);
		b1.tab[0]=c1;
		b1.tab[1]=l1;
		
		System.out.println(b1.affranchir());
		b1.affiche();
	}

}
