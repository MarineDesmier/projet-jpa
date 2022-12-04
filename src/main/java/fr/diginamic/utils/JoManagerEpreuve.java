package fr.diginamic.utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.dao.EpreuveDao;
import fr.diginamic.entites.Epreuve;

public class JoManagerEpreuve {

//	/**
//	 * Lit le contenue de mon fichier liste_des_epreuves.csv 
//	 * @return 
//	 * @throws IOException 
//	 * @return{@link Epreuve}
//	 */
//	public static Epreuve lireEpreuve() throws IOException {
//		Path pathFile = Paths.get("src/main/resources/conception/liste_des_epreuves.csv");
//		List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//		for(String ligne : lignes) {
//			System.out.println(ligne);
//		}
//		return null;
//	}

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet-jpa-JO");
	EntityManager em = emf.createEntityManager();
	
	public void insertEpreuve(Epreuve epreuve) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		transaction.commit();
	}
	
	
}
