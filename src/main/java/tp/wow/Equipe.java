package tp.wow;

import java.util.ArrayList;

public class Equipe {

	private ArrayList<Personnage> personnages = new ArrayList<Personnage>();
	private String nom = "";

	public Equipe() {
		this("No Name Squad");
	}

	public Equipe(String pNom) {
		this.setNom(pNom);
	}

	public Equipe(ArrayList<Personnage> pPersonnages, String pNom) {
		this.setPersonnages(pPersonnages);
		this.setNom(pNom);
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String pNom) {
		this.nom = pNom;
	}

	public ArrayList<Personnage> getPersonnages() {
		return this.personnages;
	}

	public void setPersonnages(ArrayList<Personnage> pPersonnages) {
		this.personnages = pPersonnages;
	}

	public void addPersonnage(Personnage pPersonnages) {
		this.personnages.add(pPersonnages);
	}

	public void removePersonnage(Personnage pPersonnages) {
		this.personnages.remove(pPersonnages);
	}

	public Personnage combat(Personnage combattantEquipe1, Personnage combattantEquipe2, Equipe equipeAdverse) {
		combattantEquipe1.combatAMort(combattantEquipe2);
		if (combattantEquipe2.getPv() <= 0) {
			equipeAdverse.removePersonnage(combattantEquipe2);
			return combattantEquipe2;
		} else {
			this.removePersonnage(combattantEquipe1);
			return combattantEquipe1;
		}
	}

	@Override
	public String toString() {
		String tostring = this.getClass().getSimpleName() + " : " + this.getNom() + "\n";
		for (Personnage personnage : this.personnages) {
			tostring += personnage.toString();
		}
		return tostring;
	}

	public void afficher() {
		System.out.println(this + "\n");
	}

}
