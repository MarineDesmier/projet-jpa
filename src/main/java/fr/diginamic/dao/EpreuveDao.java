package fr.diginamic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Epreuve;

public class EpreuveDao {

	private EntityManager em;
	
	/**
	 * constructeur
	 * @param em
	 */
	public EpreuveDao(EntityManager em) {
		this.em = em;
		
	}

	/**
	 * Fonction qui me permet de rechercher une epreuve avec son nom
	 * @param label -> nom de l'épreuve
	 * @return {@link Epreuve}
	 */
	public Epreuve find(String label) {
		
		TypedQuery<Epreuve> requeteEpreuve = em.createQuery("FROM Epreuve WHERE label=:label", Epreuve.class);
		requeteEpreuve.setParameter("label", label);
		
		
		List<Epreuve> resultatEpreuve = requeteEpreuve.getResultList();
		if(resultatEpreuve.isEmpty()) {
			return null;
		}
		return resultatEpreuve.get(0);
	}

	/**
	 * Insert une nouvelle epreuve en bdd
	 * @param epreuve
	 */
	public void insert(Epreuve epreuve) {
		em.persist(epreuve);
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
