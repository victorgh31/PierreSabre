package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
        super(nom, boissonFavorite, quantiteArgent);
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
    	int don = getArgent()/10;
    	parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
    	beneficiaire.recevoir(don);	
    }
}
