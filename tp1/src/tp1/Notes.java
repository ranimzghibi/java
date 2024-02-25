package tp1;

public class Notes implements Statisticabe , Comparable<Notes>{
	    private String intitule;
	    private double note;

	    public Notes(String intitule, double note) {
	        this.intitule = intitule;
	        this.note = note;
	    }
	    public String getIntitule() {
	        return intitule;
	    }

	    public void setIntitule(String intitule) {
	        this.intitule = intitule;
	    }

	    public double getNote(){
	        return note;
	    }
	    public void setNote(double note) {
	        this.note = note;
	    }
	    public float getValue() {
	        return (float) note;
	    }
	    public int compareTo(Notes etud) {
	        return Float.compare(this.getValue(), etud.getValue());
	    }
	    public String toString() {
	    	return "intutile : "+intitule+" /***/   note :"+note;
	    }

}
