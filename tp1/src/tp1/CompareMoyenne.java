package tp1;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant>{
	public int compare(Etudiant e1, Etudiant e2) {
		float value1 = e1.getValue();
        float value2 = e2.getValue();

        if (value1 < value2) {
            return -1;
        } else if (value1 > value2) {
            return 1;
        } else {
            return 0;
        }
    }

}
