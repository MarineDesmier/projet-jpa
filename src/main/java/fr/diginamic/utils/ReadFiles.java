package fr.diginamic.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles{
	
//	/**
//	 * fonction qui regroupe les fichiers csv à lire
//	 * @param path
//	 * @param allfiles
//	 */
//	public static void listeCsv(File path, List<String> allfiles) {
//		if (path.isDirectory()) {
//			File[] list = path.listFiles();
//			if (list != null) {
//				for (int i = 0; i < list.length; i++) {
//					// appel sur les sous dossier
//					listeCsv(list[i], allfiles);
//				}
//			}else {
//				System.err.println(path + " : Erreur de lecture !!!");
//			}
//		}else {
//			String currentFilePath = path.getAbsolutePath();
//			allfiles.add(currentFilePath);
//		}
//	}
//	
//	/**
//	 * lit tout les fichiers contenu dans mon dossier fichierCSV 
//	 * @throws IOException
//	 */
//	public void readFiles() throws IOException{
//		ArrayList<String> allFiles = new ArrayList<String>();
//		listeCsv(new File("D:\\Documents\\coursWeb\\Diginamic\\CoursJava\\TP\\projet-jpa\\src\\main\\resources\\conception\\fichierCsv"), allFiles);
//		File fichier;
//		FileReader fr;
//		BufferedReader br;
//		for(String file : allFiles) {
//			fichier = new File(file);
//			fr = new FileReader(fichier);
//			br = new BufferedReader(fr);
//			System.out.println(fichier.getAbsolutePath());
//			String ligne = br.readLine();
//			while(ligne != null) {
//				ligne = br.readLine();
//			}
//			br.close();
//			fr.close();
//		}
//	}
	public static List<String> readFromInputStream(InputStream is) throws IOException{
		List<String> lignes = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
			String ligne;
			while ((ligne = br.readLine()) != null) {
				lignes.add(ligne); 
			}
			return lignes;
		} 
	}
	
}
