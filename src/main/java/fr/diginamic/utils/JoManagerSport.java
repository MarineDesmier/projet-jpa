package fr.diginamic.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.persistence.EntityManager;

import fr.diginamic.dao.SportDao;
import fr.diginamic.entites.Sport;

public class JoManagerSport {

	/**
	 * Lit le contenue de mon fichier liste des sports.csv 
	 * @return 
	 * @throws IOException 
	 * @return{@link Sport}
	 */
	public static Sport lireSport() throws IOException {
		Path pathFile = Paths.get("src/main/resources/conception/liste des sports.csv");
		List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		for(String ligne : lignes) {
			System.out.println(ligne);
		}
		return null;
	}
	
	private SportDao sportDao;

	/**
	 * constructeur 
	 * @param em {@link EntityManager}
	 */
	public JoManagerSport(EntityManager em) {
		this.sportDao = new SportDao(em);
	}
	
	public void insertSport(Sport sport) {
		Sport s = sportDao.find(sport.getLabel());
		if(s != null) {
			return;
		}
		sportDao.insert(sport);
	}
}
