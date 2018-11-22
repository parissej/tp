package tp.loto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Run {

	private static final String CSV_FILE_PATH = "doc/euromillions_4.csv";

	public static void main(String[] args) {

		ArrayList<Tirage> listeDeTirages = new ArrayList<Tirage>();

		InputStream flux;
		try {

			flux = new FileInputStream(Run.CSV_FILE_PATH);
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

				listeDeTirages.add(new Tirage(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(),
						tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken()));
			}

			buff.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
