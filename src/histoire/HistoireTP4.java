package histoire;

import personnages.Commercant;
import personnages.Ronin;

public class HistoireTP4{
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		Commercant marco = new Commercant("Marco", 15);
		roro.donner(marco);
	}
}



//import personnages.Commercant;
//import personnages.Yakuza;
//
//public class HistoireTP4 {
//    public static void main(String[] args) {
//        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//        yaku.direBonjour();
//        Commercant marco = new Commercant("Marco", 15);
//        yaku.extorquer(marco);
//    }
//}


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