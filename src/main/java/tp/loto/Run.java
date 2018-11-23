package tp.loto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Run {

	/**
	 * String contenant le chemin relatif au fichier CSV
	 */
	private static final String CSV_FILE_PATH = "doc/euromillions_4.csv";
	private static final Logger LOG = LogManager.getLogger();

	public static void main(String[] args) {

		Run.LOG.info("Initialisation de l'objet StatsTirage");
		StatsTirages statsTirages = new StatsTirages();
		Run.LOG.info("O3bjet StatsTirage initialisé");

		try {

			InputStream flux = new FileInputStream(Run.CSV_FILE_PATH);
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);

			// PREMIERE LIGNE : LES NOMS DE COLONNES
			String ligne = buff.readLine();
			StringTokenizer tokenizer = new StringTokenizer(ligne, ";");

			// AUTRES LIGNES : LES TIRAGES
			while ((ligne = buff.readLine()) != null) {
				tokenizer = new StringTokenizer(ligne, ";");
				for (int i = 0; i < 5; i++) {
					tokenizer.nextToken();
				}

				statsTirages.ajouterTirage(new Tirage(Integer.valueOf(tokenizer.nextToken()),
						Integer.valueOf(tokenizer.nextToken()), Integer.valueOf(tokenizer.nextToken()),
						Integer.valueOf(tokenizer.nextToken()), Integer.valueOf(tokenizer.nextToken()),
						Integer.valueOf(tokenizer.nextToken()), Integer.valueOf(tokenizer.nextToken())));
			}

			System.out.println("Tirage probable, valeures moins sortie : " + statsTirages.getTirageProbable());

			buff.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
