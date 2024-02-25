package tp1;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class Stats {
	public static float moy(Etudiant e) {
	    float sum=0;
	    for (Notes note :e.notes) {
	        sum+=note.getValue();
	    }
	    return e.notes.isEmpty() ? 0:sum/e.notes.size();
	}

	 

	 public static Notes bon(Etudiant e){
	     return (Collections.max(e.notes));
	 }

	    public static  Notes moins(Etudiant e){
		     return (Collections.min(e.notes));
	    }
	    public static float moyclasse(ArrayList<Etudiant> etudiants) {
	        float sum=0;
	        int count=0;
	        for (Etudiant e:etudiants) {
	            for (Notes note:e.notes) {
	                sum+=note.getValue();
	                count++;
	            }
	        }
	        return count==0 ? 0:sum/count;
	    }

	    public static Etudiant bon_en_groupe(ArrayList<Etudiant> etudiants) {
	        return Collections.max(etudiants, Comparator.comparing(Etudiant::getValue));
	    }

	    public static Etudiant moins_en_grp(ArrayList<Etudiant> etudiants) {
	        return Collections.min(etudiants, Comparator.comparing(Etudiant::getValue));
	    }
	    

}
