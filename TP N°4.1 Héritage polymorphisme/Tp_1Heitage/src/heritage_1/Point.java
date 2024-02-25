package heritage_1;

public class Point {
	protected char nom;
	protected int abs ;
	protected int ord ;
	Point(){
		abs=0;
		ord=0;
		nom='o';
	}
	Point (char nom,int abs,int ord){
		this.nom=nom;
		this.abs=abs;
		this.ord=ord;
	}
	Point (Point p){
		nom=p.nom;
		abs=p.abs;
		ord=p.ord;
	}
	void affiche () {
		System.out.println(nom+"("+abs+","+ord+")");
	}
	void deplacer (int x,int y) {
		abs+=x;
		ord+=y;
	}
	void reset () {
		abs=0;
		ord=0;
	}
	public String toString() {
		return nom+" ("+abs+","+ord+")" ;
	}
	Boolean coincide1 (Point p) {
		return this.abs==p.abs && this.ord==p.ord;
	}
	static Boolean coincide2 (Point p,Point p1) {
		return p.abs==p1.abs && p.ord==p1.ord;
	}
	
	

}
