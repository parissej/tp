package tp.aspirateur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {

		try {
			File fichier = new File("C:\\Users\\Juliette\\eclipse-workspace\\tp\\doc\\fichier.txt");

			InputStream flux = new FileInputStream(fichier);
			InputStreamReader lecture = new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne = buff.readLine();

			// PREMIERE LIGNE
			StringTokenizer tokenizer = new StringTokenizer(ligne);
			int xMaxPiece = Integer.parseInt(tokenizer.nextToken());
			int yMaxPiece = Integer.parseInt(tokenizer.nextToken());

			// SECONDE LIGNE
			ligne = buff.readLine();
			tokenizer = new StringTokenizer(ligne);

			int xAspi = Integer.parseInt(tokenizer.nextToken());
			int yAspi = Integer.parseInt(tokenizer.nextToken());
			char cOrientAspi = tokenizer.nextToken().charAt(0);

			Aspirateur iHoover = new Aspirateur(xAspi, yAspi, cOrientAspi, xMaxPiece, yMaxPiece);

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
