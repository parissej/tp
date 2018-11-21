package tp.wow;

public class Epee extends Arme {

	private int longueur; // en cm

	public Epee() {
		this("EPEE", 0, 0);
	}

	public Epee(String pNom, int pDegatsParAttaque, int pLongueur) {
		super(pNom, pDegatsParAttaque);
		this.longueur = pLongueur;
	}

	public int getLongueur() {
		return this.longueur;
	}

	public void setLongueur(int pLongueur) {
		this.longueur = pLongueur;
	}

}
