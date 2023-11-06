package personnages;

public class Commercant extends Humain {
    public Commercant(String nom, int quantiteArgent) {
        super(nom, "thé", quantiteArgent);
    }

    public int seFaireExtorquer() {
        int extorsion = getArgent();
        perdreArgent(extorsion);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return extorsion;
    }
    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur!");
        boire();
    }
}