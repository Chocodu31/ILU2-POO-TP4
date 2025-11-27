package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {

//	public static void acheterProduit(Etal[] marche, String produit, int quantiteSouhaitee) {
//		int quantiteRestante = quantiteSouhaitee;
//		for (int i = 0; i < marche.length && quantiteRestante != 0; i++) {
//			Etal etal = marche[i];
//			int quantiteDisponible = etal.contientProduit(produit, quantiteRestante);
//			if (quantiteDisponible != 0) {
//				int prix = etal.acheterProduit(quantiteDisponible);
//				String chaineProduit = accorderNomProduit(produit, quantiteDisponible);
//				System.out.println("A l'étal n° " + (i + 1) + ", j'achete " + quantiteDisponible + " " + chaineProduit
//						+ " et je paye " + prix + " sous.");
//				quantiteRestante -= quantiteDisponible;
//			}
//		}
//		String chaineProduit = accorderNomProduit(produit, quantiteSouhaitee);
//		System.out.println("Je voulais " + quantiteSouhaitee + " " + chaineProduit + ", j'en ai acheté "
//				+ (quantiteSouhaitee - quantiteRestante) + ".");
//	}

	private static String accorderNomProduit(String produit, int quantiteSouhaitee) {
		String chaineProduit = produit;
		if (quantiteSouhaitee > 1) {
			chaineProduit = produit + "s";
		}
		return chaineProduit;
	}

	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		IEtal[] marche = new IEtal[3];
		Etal<Sanglier> Etal1sanglier = new Etal<Sanglier>();
		Etal<Sanglier> Etal2sanglier = new Etal<Sanglier>();
		Etal<Poisson> Etalpoisson = new Etal<Poisson>();
		
		marche[0] = Etal1sanglier;
		marche[1] = Etal2sanglier;
		marche[2] = Etalpoisson;
		
		Etal2sanglier.installerVendeur(obelix, sangliersObelix, 8);
		Etal1sanglier.installerVendeur(asterix, sangliersAsterix, 10);
		Etalpoisson.installerVendeur(ordralfabetix, poissons, 7);

		System.out.println(Etal1sanglier.etatEtal());
		System.out.println(Etal2sanglier.etatEtal());
		System.out.println(Etalpoisson.etatEtal());
		
		int i = 0;
		int jeveux = 3;
		while (jeveux != 0) {
			int possible = marche[i].contientProduit("sanglier", jeveux);
			if (possible < jeveux) {
				if (possible == 0) {
					if (i==marche.length-1) break;
					i++;
				} else {
					System.out.println("Achat etal n*" + i);
					System.out.println("J'ai payé " + marche[i].acheterProduit(possible));
					jeveux-=possible;
					System.out.println("J'ai acheter " + possible + " il me reste a acheter " + jeveux);
					if (i==marche.length-1) break;
					i++;
				}
			}
			if (possible > jeveux) {
				System.out.println("Achat etal n*" + i);
				System.out.println("J'ai payé " + marche[i].acheterProduit(jeveux));
				System.out.println("J'ai acheter " + jeveux + "\n");
				jeveux=0;
			}
		}
		
		System.out.println(Etal1sanglier.etatEtal());
		System.out.println(Etal2sanglier.etatEtal());
		System.out.println(Etalpoisson.etatEtal());
		
		
	}

}
