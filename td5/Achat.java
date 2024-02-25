package td5;

class Achat {
    static Article[] supermarche = new Article[4];

    public static void main(String[] args) {
    	supermarche[0] = new Vetement(123, "Jupe bleue taille S", 39.000f, 2, "Blue", 34);
        supermarche[1] = new ProduitElc(145, "TV Led 80cm", 1450.000f, 0, "TV");
        supermarche[2] = new Vetement(178, "Pantalon noir taille M", 42.000f, 5, "Black", 42);
        supermarche[3] = new ProduitGC(191, "Pates", 0.410f, 18);

        float montantTotal = 0;
        String dateAchat = "21/03/2023";

        for (int i = 0; i < supermarche.length; i++) {
            

            if (supermarche[i].qteStock>0) {
                double prix = supermarche[i].prixDeVente(dateAchat);
                montantTotal += prix;
                System.out.println("Article acheté:");
                supermarche[i].decrire();
                System.out.println("Prix a payer: " + prix);
            } else {
                System.out.println("Article indisponible. Approvisionnement en cours...");
                
            }
        }

        System.out.println("Montant total a payer: " + montantTotal);
    }
}
