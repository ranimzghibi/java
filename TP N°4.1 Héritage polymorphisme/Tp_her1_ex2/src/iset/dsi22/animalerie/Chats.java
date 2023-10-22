package iset.dsi22.animalerie;

public class Chats extends Animal {
	private boolean sauvage;
	Chats (){
		super();
		this.sauvage=false;
	}
	Chats(String couleur, int poids,boolean test){
		super(couleur,poids);
		this.sauvage=test;
	}
}
