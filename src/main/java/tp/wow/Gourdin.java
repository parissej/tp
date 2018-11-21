package tp.wow;

public class Gourdin extends Arme {

	private int poids; // en g

	public Gourdin() {
		this("GOURDIN", 0, 0);
	}

	public Gourdin(String pNom, int pDegatsParAttaque, int pPoids) {
		super(pNom, pDegatsParAttaque);
		this.poids = pPoids;
	}

	public int getPoids() {
		return this.poids;
	}

	public void setPoids(int pPoids) {
		this.poids = pPoids;
	}
}
