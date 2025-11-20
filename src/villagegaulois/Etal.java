package villagegaulois;

import personnages.Gaulois;

public class Etal implements IEtal {
	private Gaulois vendeur;
	private String[] produits;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;
	
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
