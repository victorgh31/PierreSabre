package personnages;

public class Humain {
	    private String nom;
	    private String boissonFavorite;
	    private int quantiteArgent;

	    public Humain(String nom, String boissonFavorite, int quantiteAargent) {
	        this.nom = nom;
	        this.boissonFavorite = boissonFavorite;
	        this.quantiteArgent = quantiteArgent;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public int getArgent() {
	        return quantiteArgent;
	    }

	    public void gagnerArgent(int gain) {
	        quantiteArgent += gain;
	    }

	    public void perdreArgent(int perte) {
	        quantiteArgent -= perte;
	    }

	    public void direBonjour() {
	        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	    }

	    public void boire() {
	        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	    }

	    public void acheter(String bien, int prix) {
	        if (quantiteArgent >= prix) {
	            quantiteArgent -= prix;
	            parler("J'ai " + quantiteArgent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
	        } else {
	            parler("Je n'ai plus que " + quantiteArgent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
	        }
	    }

	    private void parler(String texte) {
	        System.out.println("(" + nom + ") - " + texte);
	    }
	}
