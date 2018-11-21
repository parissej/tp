package tp.aspirateur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {

		File fichier = new File("C:\\Users\\Juliette\\eclipse-workspace\\TPs\\doc\\fichier.txt");

		try {
			InputStream flux = new FileInputStream(fichier);
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne = buff.readLine();

			// PREMIERE LIGNE
			StringTokenizer tokenizer = new StringTokenizer(ligne);
			Object[][] piece = new Object[Integer.parseInt(tokenizer.nextToken())][Integer
					.parseInt(tokenizer.nextToken())];

			// SECONDE LIGNE
			ligne = buff.readLine();
			tokenizer = new StringTokenizer(ligne);

			Aspirateur iHoover = new Aspirateur(Integer.parseInt(tokenizer.nextToken()),
					Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken().charAt(0));

			piece[iHoover.getX()][iHoover.getY()] = iHoover;

			// TROISIEME LIGNE
			ligne = buff.readLine();

			for (int i = 0; i < ligne.length(); i++) {
				iHoover.executerCommande(ligne.charAt(i));
			}

			System.out.println(iHoover);

			buff.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
