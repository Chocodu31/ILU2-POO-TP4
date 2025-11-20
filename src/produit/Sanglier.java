package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public void décrireProduit() {
		System.out.println(nom + " de " + poids + unite + " chassÃ© par " + chasseur.getNom() + ".");
	}
	
	
}
