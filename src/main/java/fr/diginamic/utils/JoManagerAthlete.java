package fr.diginamic.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.dao.AthleteDao;
import fr.diginamic.entites.Athlete;

/**
 * Classe qui va me lire le contenu de mes fichier csv 
 * @author Marine Desmier
 *
 */
public class JoManagerAthlete {

//	/**
//	 * Lit le contenue de mon fichier athlete_epreuve.csv 
//	 * @param cheminFichier chemin d'accès du fichier
//	 * @return 
//	 * @throws IOException 
//	 * @return{@link Athlete}
//	 */
//	public static Athlete lireAthlete() throws IOException {
////		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet-jpa-JO");
////		EntityManager em = emf.createEntityManager();
////		EntityTransaction transaction = em.getTransaction();
//		Path pathFile = Paths.get("src/main/resources/conception/athlete_epreuves.csv");
//		List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//		for(String ligne : lignes) {
//			System.out.println(ligne);
//		}
//		return null;
//	}
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet-jpa-JO");
	EntityManager em = emf.createEntityManager();	
	
	public void insertAthlete(Athlete athlete) {
//		Athlete a = athleteDao.find(athlete.getNom());
//		if(a != null) {
//			return;
//		}
//		athleteDao.insert(athlete);
//	}
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		transaction.commit();
	}
}
