package personnages;

import java.util.ArrayList;
import java.util.List;

public class Humain {
	    private String nom;
	    private String boissonFavorite;
	    private int quantiteArgent;
	    private List<Humain> memoire;
	    private static final int CAPACITE_MEMOIRE = 30;

	    public Humain(String nom, String boissonFavorite, int quantiteArgent) {
	        this.nom = nom;
	        this.boissonFavorite = boissonFavorite;
	        this.quantiteArgent = quantiteArgent;
	        this.memoire = new ArrayList<>();
	    }
	    //getteurs
	    public String getNom() {
	        return nom;
	    }
	    public int getArgent() {
	        return quantiteArgent;
	    }
	    //6 méthodes
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
	    protected void parler(String texte) {
	        System.out.println("(" + nom + ") - " + texte);
	    }
	    
	    public void faireConnaissance(Humain humain) {
	        direBonjour();
	        humain.direBonjour();

	        // Ajouter les humains à la mémoire de chacun
	        enrichirMemoire(humain);
	        humain.enrichirMemoire(this);
	    }

		private void enrichirMemoire(Humain newConnaissance) {
		    if (memoire.size() >= CAPACITE_MEMOIRE) {
		        oublierAncienAmi();
		    }
		    memoire.add(newConnaissance);
		}
		
		private void oublierAncienAmi() {
		    if (!memoire.isEmpty()) {
		        Humain oldConnaissance = memoire.remove(0);
		        System.out.println("(" + nom + ") - J'oublie " + oldConnaissance.getNom() + ". Il y a trop de monde dans ma tête !");
		    }
		}
		
		public void listerConnaissance() {
			String message = "(" + nom + ") - Je connais beaucoup de monde dont : ";
		    for (Humain ami : memoire) {
		        message += " " + ami.getNom();
		    System.out.println(message);
		    }
		}

}