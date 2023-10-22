package iset.dsi22.animalerie;

public class Chiens extends Animal{
	private String race;
	Chiens (){
		super();
		this.race="berger australien";
	}
	Chiens(String couleur, int poids,String race){
		super(couleur,poids);
		this.race=race;
	}
}
