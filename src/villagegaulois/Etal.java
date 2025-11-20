package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> implements IEtal {
	private Gaulois vendeur;
	private P[] produit;
	private int quantiteDebutMarche;
	private int quantite;
	private int nbProduit = 0;
	private boolean etalOccupe = false;
	private int prix;
	
	public void installerVendeur(Gaulois vendeur, P[] produit, int prix) {
		this.vendeur = vendeur;
		this.produit = produit;
		this.prix = prix;
		this.nbProduit = produit.length;
	}
	
	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

}
