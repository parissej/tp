package tp.loto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StatsTirages {

	private ArrayList<Tirage> listeDeTirages;

	public StatsTirages() {
		this.setListeDeTirages(new ArrayList<Tirage>());
	}

	public StatsTirages(ArrayList<Tirage> pListeDeTirages) {
		this.setListeDeTirages(pListeDeTirages);
	}

	public ArrayList<Tirage> getListeDeTirages() {
		return this.listeDeTirages;
	}

	public void setListeDeTirages(ArrayList<Tirage> pListeDeTirages) {
		this.listeDeTirages = pListeDeTirages;
	}

	public void ajouterTirage(Tirage pTirage) {
		this.getListeDeTirages().add(pTirage);
	}

	public int getNombreSortiesBoule1(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getBoule_1() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesBoule2(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getBoule_2() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesBoule3(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getBoule_3() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesBoule4(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getBoule_4() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesBoule5(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getBoule_5() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesEtoile1(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getEtoile_1() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getNombreSortiesEtoile2(int valeurRecherchee) {
		int nombreDeFoisSortie = 0;
		for (Tirage tirage : this.getListeDeTirages()) {
			if (tirage.getEtoile_2() == valeurRecherchee) {
				nombreDeFoisSortie++;
			}
		}
		return nombreDeFoisSortie;
	}

	public int getBoule1LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des boules vont de 1 à 50
		for (int i = 1; i <= 50; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesBoule1(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getBoule2LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des boules vont de 1 à 50
		for (int i = 1; i <= 50; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesBoule2(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getBoule3LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des boules vont de 1 à 50
		for (int i = 1; i <= 50; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesBoule3(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getBoule4LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des boules vont de 1 à 50
		for (int i = 1; i <= 50; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesBoule4(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getBoule5LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des boules vont de 1 à 50
		for (int i = 1; i <= 50; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesBoule5(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getEtoile1LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des étoiles vont de 1 à 12
		for (int i = 1; i <= 12; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesEtoile1(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	public int getEtoile2LaMoinsSortie() {

		// < valeur de la boule , nombre de sorties >
		HashMap<Integer, Integer> listeNombreDeSorties = new HashMap<>();
		Stream<Map.Entry<Integer, Integer>> sorted_listeNombreDeSorties = listeNombreDeSorties.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());

		// Les valeurs des étoiles vont de 1 à 12
		for (int i = 1; i <= 12; i++) {
			listeNombreDeSorties.put(i, this.getNombreSortiesEtoile2(i));
		}

		return sorted_listeNombreDeSorties.findFirst().get().getKey();
	}

	/**
	 *
	 * @return le Tirage le plus probable
	 */
	public Tirage getTirageProbable() {

		Tirage probable = new Tirage(this.getBoule1LaMoinsSortie(), this.getBoule2LaMoinsSortie(),
				this.getBoule3LaMoinsSortie(), this.getBoule4LaMoinsSortie(), this.getBoule5LaMoinsSortie(),
				this.getEtoile1LaMoinsSortie(), this.getEtoile2LaMoinsSortie());

		return probable;
	}

}
