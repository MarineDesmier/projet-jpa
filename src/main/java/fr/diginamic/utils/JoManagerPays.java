package fr.diginamic.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import fr.diginamic.entites.Pays;

public class JoManagerPays {

	/**
	 * Lit le contenue de mon fichier liste des sports.csv 
	 * @return 
	 * @throws IOException 
	 * @return{@link Pays}
	 */
	public static Pays lirePays() throws IOException {
		Path pathFile = Paths.get("src/main/resources/conception/wikipedia-iso-country-codes.csv");
		List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		for(String ligne : lignes) {
			System.out.println(ligne);
		}
		return null;
	}
}
