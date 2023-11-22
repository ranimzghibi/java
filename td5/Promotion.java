package td5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface Promotion {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static final LocalDate debutPromo = LocalDate.parse("19/03/2022", formatter);
    public static final LocalDate finPromo = LocalDate.parse("31/03/2022", formatter);
	
	abstract double prixDeVente(String dateStr);
	
	default boolean estPeriodePromo (String dateStr){
		LocalDate date = LocalDate.parse(dateStr, formatter);
		if (((date.isEqual(debutPromo) || date.isAfter(debutPromo)) && (date.isEqual(finPromo) || date.isBefore(finPromo))))
			return true;
		else return false ;
	}
	
	static double calculerRemise(double prixAvantRemise, double prixApresRemise){
		return (( prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
	}
}
