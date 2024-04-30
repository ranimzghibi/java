package ma.projet.beans;

public class Client {
    
    private String nom;
    private String prenom;
    private int id;

    
    public Client(int id, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

  
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
       
    }

  
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
