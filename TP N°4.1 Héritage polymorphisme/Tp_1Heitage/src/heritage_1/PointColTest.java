package heritage_1;

public class PointColTest {

	public static void main(String[] args) {
		Pointcol p= new Pointcol('p',4,6,"rose");
		Pointcol k= new Pointcol();
		p.affiche ();
		k.affiche ();
		p.SetColor("Jaune");
		p.affiche ();

	}

}
