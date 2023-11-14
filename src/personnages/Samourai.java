package personnages;

public class Samourai extends Ronin {
	private String seigneurName;
	
	public Samourai(String seigneurName, String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
		this.seigneurName = seigneurName;
	}
	@Override
	public void direBonjour() {
    	super.direBonjour();
    	parler("Je suis fier de servir le seigneur " + seigneurName);
    }	
	public void boire(String boisson) {
        parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
    }
}
