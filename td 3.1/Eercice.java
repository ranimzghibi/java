package exercice;
import java.util.Scanner;
public class Eercice {
	private static final int nmax=40;
	static void remplir(float t[]) {
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < t.length; i++) {
			System.out.print("Entrez la valeur pour t[" + i + "]: ");
		    t[i] = scanner.nextFloat();
		}
		
	}
	static float somme_element (float t[]) 
	{
		float sum=0;
		for (int i = 0; i < t.length; i++)
			sum=sum+t[i];
		return (sum);
	}
	static float[] additionner (float t1[], float t2[]){
		int n ;
		int i;
		if (t1.length>t2.length)
			n=t1.length;
		else n=t2.length;
		float add[]= new float[n];
	    for (i=0;i<n;i++) {
	        if (i<t1.length) {
	            add[i]+= t1[i];
	        }
	        if (i<t2.length) {
	            add[i]+= t2[i];
	        }
	    }
	    return add ;
	}
	static void produit (float x, float t[]) {
		int i=0;
		 for (i=0;i<t.length;i++) {
			 t[i]=t[i]*x;
		 }
		
	}
	static void lister (float t[]){
		int i=0;
		for (i=0;i<t.length;i++) {
			 System.out.println("la case "+i+":"+t[i]+"\n");
		 }
		
	}
	static void div (float x, float t[]) {
		int i=0;
		 for (i=0;i<t.length;i++) {
			 t[i]=t[i] /3;
		 }
		 }
	static float[] additionner(float x, float t[]){
		float add[]= new float[t.length];
		int i=0;
		 for (i=0;i<t.length;i++) {
			 add[i]=t[i]+x;
		 }
		 return add;
		 }
	
	
		
	
	

}