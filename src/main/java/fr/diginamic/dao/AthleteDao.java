package fr.diginamic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Athlete;

public class AthleteDao {

	private EntityManager em;

	/**
	 * constructeur
	 * @param em
	 */
	public AthleteDao(EntityManager em) {
		this.em = em;
		
	}

	/**
	 * Fonction qui me permet de rechercher un athlete avec son nom
	 * @param nom -> nom de l'athlete
	 * @return {@link Athlete}
	 */
	public Athlete find(String nom) {
		TypedQuery<Athlete> requeteAthlete = em.createQuery("FROM Athlete WHERE nom=:nom", Athlete.class);
		requeteAthlete.setParameter("nom", nom);
		
		
		List<Athlete> resultatAthlete = requeteAthlete.getResultList();
		if(resultatAthlete.isEmpty()) {
			return null;
		}
		return resultatAthlete.get(0);
	}

	/**
	 * Insère un nouvelle athlete en bdd
	 * @param athlete
	 */
	public void insert(Athlete athlete) {
		em.persist(athlete);
	}

	/**
	 * Getter pour l'attribut em 
	 * @return the em
	 */
	public EntityManager getEm() {
		return em;
	}

	/**
	 * Setter pour l'attribut em
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	} 

}
