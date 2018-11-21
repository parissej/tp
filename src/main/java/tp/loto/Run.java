package tp.loto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class Run {

	public static void main(String[] args) {
		File fichier = new File("C:\\Users\\Juliette\\eclipse-workspace\\TPs\\doc\\euromillions_4.csv");

		FileReader filereader;
		try {
			filereader = new FileReader(fichier);
			CSVReader csvReader = new CSVReader(filereader);

			csvReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// int[][] resultat = new int[300][7];
	}

}
