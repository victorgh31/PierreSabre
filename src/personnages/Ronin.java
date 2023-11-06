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
    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;

        if (force >= adversaire.getReputation()) {
        	parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        	parler("Je t'ai eu petit yakuza!");
            adversaire.perdre();
            honneur++;
        } else {
        	parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        	adversaire.gagner(getArgent());
            honneur--;
            int argent = getArgent() - getArgent();
        }
    }
}
