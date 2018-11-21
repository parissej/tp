package tp.wow;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {

		// INITIALISATION DES EQUIPES
		Equipe equipeHero = new Equipe("Alliance");
		Personnage arthur = new Personnage(300, "Arthur", new Arme("Excalibur", 50));
		Personnage jaina = new Personnage(200, "Jaina", new Arme("Le bâton de ses morts", 100));
		Personnage jerome = new Personnage(250, "Jerome", new Arme("Le cookie sacré", 75));
		Personnage claire = new Personnage(350, "Claire", new Arme("L'éblouissant swag", 50));
		equipeHero.addPersonnage(arthur);
		equipeHero.addPersonnage(jaina);
		equipeHero.addPersonnage(jerome);
		equipeHero.addPersonnage(claire);

		Equipe equipeMonstre = new Equipe("Horde");
		Personnage grum = new Personnage(250, "Grum", new Arme("L'abattoir", 50));
		Personnage thrall = new Personnage(150, "Thrall", new Arme("L'écorcheur", 150));
		Personnage roiliche = new Personnage(300, "Roi Liche", new Arme("L'abattoir", 40));
		Personnage loki = new Personnage(170, "Loki", new Arme("Tesseract", 90));
		equipeMonstre.addPersonnage(grum);
		equipeMonstre.addPersonnage(thrall);
		equipeMonstre.addPersonnage(roiliche);
		equipeMonstre.addPersonnage(loki);

		System.out.println("---- EQUIPE PARTICIPANTES ----");

		equipeHero.afficher();
		equipeMonstre.afficher();

		List<Personnage> couples = new ArrayList<Personnage>();

		couples.addAll(equipeHero.getPersonnages());
		couples.addAll(equipeMonstre.getPersonnages());

		System.out.println("---- COMBATS ----\n");

		// ATENTION, SI LES DEUX EQUIPES NE SONT PAS DE LA MEME TAILLE CEST LA MERDE
		while (equipeHero.getPersonnages().size() > 0 && equipeMonstre.getPersonnages().size() > 0) {
			couples.remove(
					couples.indexOf(equipeHero.combat(couples.get(0), couples.get(couples.size() - 1), equipeMonstre)));
			equipeHero.afficher();
			equipeMonstre.afficher();

		}

		System.out.println("---- RESULTATS ----\n");

		equipeHero.afficher();
		equipeMonstre.afficher();

		Equipe vainqueur = equipeHero.getPersonnages().size() == 0 ? equipeMonstre : equipeHero;

		System.out.printf("L'équipe %s remporte le tournoi !", vainqueur.getNom());

	}

}
