package tp1;

import java.util.Collections;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
        Etudiant etudiant1 = new Etudiant("123", "ranim");
        etudiant1.addNote("Math", 90);
        etudiant1.addNote("English", 85);


        Stats st =new Stats();
        
        System.out.println(st.bon(etudiant1));
        System.out.println(st.moins(etudiant1));
        System.out.println(st.moy(etudiant1));
        
        
        Etudiant etudiant2 = new Etudiant("456", "seif");
        etudiant1.addNote("Math", 95);
        etudiant1.addNote("English", 90);

        ArrayList<Etudiant> etudiants = new ArrayList<>();
        
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        Stats st2 =new Stats();
        System.out.println("/*************Groupe******************/");
        System.out.println("moyenne classe");
        System.out.println(st2.moyclasse(etudiants));
        System.out.println(st2.bon_en_groupe(etudiants));
        System.out.println(st2.moins_en_grp(etudiants));
        
        System.out.println("/*************Sort******************/");
		Collections.sort(etudiants);
		System.out.println(etudiants);
		
		
		Collections.sort(etudiants, new CompareMoyenne());
		System.out.println(etudiants);
		
		
		Collections.sort(etudiants, new CompareNom());
		System.out.println(etudiants);

	}

}
