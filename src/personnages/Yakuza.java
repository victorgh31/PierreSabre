package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
        super(nom, boissonFavorite, quantiteArgent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
    	parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
        int argentVictime = victime.seFaireExtorquer();
        int butin = getArgent() + argentVictime;
        parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + butin + " sous dans ma poche. Hi ! Hi !");
        reputation++;
    }
}

