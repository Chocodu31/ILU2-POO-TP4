package produit;

public class Poisson extends Produit{
	String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}
	
	@Override
	public void d�crireProduit() {
		System.out.println(nom + " pêchés " + datePeche + ".");
	}
	
	
}