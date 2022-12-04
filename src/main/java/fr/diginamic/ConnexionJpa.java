package fr.diginamic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.entites.Traduction;

public class ConnexionJpa {

	public static void main(String[] args) throws IOException{

//		Scanner scanner = new Scanner(new File("src/main/resources/conception/fichierCsv/liste des sports.csv"));
//		scanner.useDelimiter(",");
//		while(scanner.hasNext()) {
//			System.out.println(scanner.next());
//		}
//		scanner.close();
//		
		String sql = "INSERT INTO sport(LABEL, ID_TRADUCTION) VALUES (?, ?)";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet-jpa-JO");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        
        // lecture du 1er fichier -> liste des sports
        Path path = Paths.get("src/main/resources/conception/fichierCsv/liste des sports.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        
        // on supprime la ligne des titres
        lines.remove(0);
        List<Traduction> traductionSports = new ArrayList<Traduction>();
        
        for(String line : lines) {
        	transaction.begin();
        	String[] morceaux = line.split(";");
        	String libeleEN = morceaux[0];
        	String libeleFR = morceaux[1];
        	Traduction traductionSport = new Traduction();
        	traductionSport.setTraduction(libeleEN);
        	traductionSport.setTraduction(libeleFR);
        	traductionSports.add(traductionSport);
        	em.persist(traductionSport);
        	transaction.commit();
        }
        
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/conception/fichierCsv/liste des sports.csv"));
//			String line = "";
//			while((line = br.readLine()) != null) {
//				try {
//					if(line != null) {
//						String[] array = line.split(",");
//						for(String result : array) {
//							System.out.println(result);
//						PreparedStatement ps = em.createPreparedStatement(sql);
//						ps.setString(1, str[0]);
//						ps.setString(2, str[1]);
//						ps.executeUpdate();
//						ps.close();
//						}
//					}
//				}catch(IOException ex) { 
//					ex.printStackTrace();
//				}finally {
//					if(br == null) {
//						br.close();
//					}
//				}
//			}
//		} catch (FileNotFoundException e) {
//			
//		}
	}

}
