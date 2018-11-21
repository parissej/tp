package tp.wow;

public class Arme {

	private String nom;
	private int degatsParAttaque;
	private EtatArme etat;
	private int nombreUtilisation;

	public Arme() {
		this("ARME", 0);
	}

	public Arme(String pNom, int pDegatsParAttaque) {
		this.setEtat(EtatArme.NEUF);
		this.setNom(pNom);
		this.setDegatsParAttaque(pDegatsParAttaque);
	}

	public int getDegatsParAttaque() {
		return this.degatsParAttaque;
	}

	public void setDegatsParAttaque(int pDegatsParAttaque) {
		this.degatsParAttaque = pDegatsParAttaque;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String pNom) {
		this.nom = pNom;
	}

	public EtatArme getEtat() {
		return this.etat;
	}

	private void setEtat(EtatArme pEtat) {
		this.etat = pEtat;
	}

	public int getNombreUtilisation() {
		return this.nombreUtilisation;
	}

	public void setNombreUtilisation(int pNombreUtilisation) {
		this.nombreUtilisation = pNombreUtilisation;
	}

	public void ajouterUneUtilisation() {
		this.setNombreUtilisation(this.getNombreUtilisation() + 1);
	}

	/**
	 * Baisse l'état de l'arme d'un cran
	 */
	public void baisserEtat() {
		switch (this.getEtat()) {
		case NEUF:
			this.setEtat(EtatArme.USAGE);
			break;
		case USAGE:
			this.setEtat(EtatArme.HORS_D_USAGE);
			break;
		case HORS_D_USAGE:
			break;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.getNom() + ", DPS : " + this.getDegatsParAttaque() + ", "
				+ this.getEtat() + " (" + this.getNombreUtilisation() + " utilisations)";
	}

}
