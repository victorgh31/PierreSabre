package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
        Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        yakuza.direBonjour();
        Commercant marco = new Commercant("Marco", 15);
        yakuza.extorquer(marco);
    }
}


//import personnages.Commercant;
//
//public class HistoireTP4 {
//    public static void main(String[] args) {
//        Commercant marco = new Commercant("Marco", 20);
//        marco.direBonjour();
//        int extorsion = marco.seFaireExtorquer();
//        marco.recevoir(15);
//    }
//}


//import personnages.Humain;
//
//public static void main(String[] args) {
//    Humain prof = new Humain("Prof", "kombucha", 54);
//    prof.direBonjour();
//    prof.acheter("boisson", 12);
//    prof.boire();
//    prof.acheter("jeu", 2);
//    prof.acheter("kimono", 50);
//}