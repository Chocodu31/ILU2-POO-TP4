package produit;

public class Poisson extends Produit{
	String datePeche;
	
	protected Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}
	
	@Override
	public void décrireProduit() {
		System.out.println(nom + " pêchés " + datePeche + ".");
	}
	
	
}