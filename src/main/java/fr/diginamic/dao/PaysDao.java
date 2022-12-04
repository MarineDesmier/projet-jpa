package fr.diginamic.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Pays;



public class PaysDao{

	private EntityManager em;

	/**
	 * constructeur
	 * @param em
	 */
	public PaysDao(EntityManager em) {
		this.em = em;
		
	}

	/**
	 * Fonction qui me permet de rechercher un pays avec son nom
	 * @param nom -> nom du pays
	 * @return {@link Pays}
	 */
	public Pays find(String nom) {
		TypedQuery<Pays> requetePays = em.createQuery("FROM Pays WHERE nom=:nom", Pays.class);
		requetePays.setParameter("nom", nom);
		
		
		List<Pays> resultatPays = requetePays.getResultList();
		if(resultatPays.isEmpty()) {
			return null;
		}
		return resultatPays.get(0);
	}

	/**
	 * Insère un nouveau Pays dans la bdd
	 * @param pays
	 */
	public void insert(Pays pays) {
		em.persist(pays);
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
