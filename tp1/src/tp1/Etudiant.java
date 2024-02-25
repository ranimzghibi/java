package tp1;
import java.util.ArrayList;

public class Etudiant implements Statisticabe , Comparable<Etudiant>{
	
	 public String matricule;
	 public String nom;
	 public ArrayList<Notes> notes;
	 public Etudiant(String matricule, String nom) {
	     this.matricule = matricule;
	     this.nom = nom;
	     this.notes = new ArrayList<>();
	    }
	 public void addNote(String intitule, double note) {
	        this.notes.add(new Notes(intitule, note));
	    }
	 public float getValue() {
	        if (notes.isEmpty()) {
	            return 0;
	        }
	        float sum=0;
	        for (Notes note:notes) {
	            sum+= note.getValue();
	        }
	        return sum/notes.size();
	    }
	 public int compareTo(Etudiant etud) {
	        return Float.compare(this.getValue(), etud.getValue());
	    }
	 public String toString () {
		 return "nom: "+nom+" matricule : "+matricule;
	 }

	
	

}
