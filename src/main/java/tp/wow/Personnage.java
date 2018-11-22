package tp.wow;

import java.util.Random;

public class Personnage {

	private int pv;
	private int pvMax;
	private String nom;
	private Arme arme;

	public Personnage() {
		this(0, "Arme", new Arme());
	}

	/**
	 *
	 * @param pPvMax ses pv au max
	 * @param pNom   le nom du personnage
	 * @param pArme  son arme
	 */
	public Personnage(int pPvMax, String pNom, Arme pArme) {
		this.setPv(pPvMax);
		this.setPvMax(pPvMax);
		this.setNom(pNom);
		this.setArme(pArme);
	}

	public int getPvMax() {
		return this.pvMax;
	}

	private void setPvMax(int pPvMax) {
		this.pvMax = pPvMax;
	}

	public int getPv() {
		return this.pv;
	}

	private void setPv(int pPv) {
		this.pv = pPv <= 0 ? 0 : pPv;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String pNom) {
		this.nom = pNom;
	}

	public Arme getArme() {
		return this.arme;
	}

	public void setArme(Arme pArme) {
		this.arme = pArme;
	}

	public EtatArme getEtatArme() {
		return this.getArme().getEtat();
	}

	public int getNombreUtilisationArme() {
		return this.getArme().getNombreUtilisation();
	}

	/**
	 * Lance un combat à mort entre deux Personnages
	 *
	 * @param pDefenseur
	 * @return le Personnage mort
	 */
	public Personnage combatAMort(Personnage pDefenseur) {

		Random commencePremier = new Random();
		Personnage first = commencePremier.nextBoolean() ? this : pDefenseur;
		Personnage second = first == this ? pDefenseur : this;

		while (this.getPv() > 0 && pDefenseur.getPv() > 0) {
			first.attaquer(second);
			if (this.getPv() > 0 && pDefenseur.getPv() > 0) {
				second.attaquer(first);
			} else {
				return second;
			}
		}

		return first;

	}

	public void attaquer(Personnage pDefenseur) {
		if (this.getEtatArme() != EtatArme.HORS_D_USAGE) {
			pDefenseur.recevoirDesDegats(this.getArme().getDegatsParAttaque());
			if (this.getEtatArme() == EtatArme.USAGE) {
				this.getArme().setDegatsParAttaque(this.getArme().getDegatsParAttaque() / 2);
			}
			this.getArme().ajouterUneUtilisation();

			if (this.getEtatArme() == EtatArme.NEUF && this.getNombreUtilisationArme() == 4) {
				this.getArme().baisserEtat();
			}

			if (this.getEtatArme() == EtatArme.USAGE && this.getNombreUtilisationArme() == 7) {
				this.getArme().baisserEtat();
			}

		}
	}

	public void recevoirDesDegats(int pDegatsRecus) {
		this.setPv(this.getPv() - pDegatsRecus);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.getNom() + ", PV : " + this.getPv() + "/"
				+ this.getPvMax() + "\n" + this.getArme() + "\n";
	}

	public void afficher() {
		System.out.println(this);
	}

}
