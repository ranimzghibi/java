package heritage_1;

public class Pointcol extends Point {
	private String color;
	Pointcol(){
		super();
		this.color="black";
	}
	Pointcol(char nom,int abs,int ord,String color){
		super(nom,abs,ord);
		this.color=color;
	}
	String getColor() {
		return this.color;
	}
	void SetColor(String Color) {
		this.color=Color;
	}
	void affiche (){
		super.affiche();
		System.out.println("color:"+getColor());
	
	
	}
}
