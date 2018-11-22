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

}
