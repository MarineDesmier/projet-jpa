package fr.diginamic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Sport;

public class SportDao{

	private EntityManager em;

	/**
	 * constructeur
	 * @param em
	 */
	public SportDao(EntityManager em) {
		this.em = em;
		
	}

	/**
	 * Fonction qui me permet de rechercher un sport avec son nom
	 * @param label -> nom du sport
	 * @return {@link Sport}
	 */
	public Sport find(String label) {
		TypedQuery<Sport> requete = em.createQuery("FROM Sport WHERE label=:label", Sport.class);
		requete.setParameter("label", label);
		
		
		List<Sport> resultatEpreuve = requete.getResultList();
		if(resultatEpreuve.isEmpty()) {
			return null;
		}
		return resultatEpreuve.get(0);
	}

	public void insert(Sport sport) {
		em.persist(sport);
	} 

}
