package fr.diginamic.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medaille")
public class Medaille {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MEDAILLE")
	private int id;
	
	@Column(name = "OR", nullable = true)
	private Boolean or;
	
	@Column(name = "ARGENT", nullable = true)
	private Boolean argent;
	
	@Column(name = "BRONZE", nullable = true)
	private Boolean bronze;

	@ManyToMany(mappedBy = "medailles")
	private List<Athlete> athletes;
	
	@ManyToOne
	@JoinColumn(name = "ID_EPREUVE")
	private Epreuve epreuve;
	
	public Medaille() {}

	@Override
	public String toString() {
		return "Medaille [id=" + id + ", or=" + or + ", argent=" + argent + ", bronze=" + bronze + ", athletes="
				+ athletes + ", epreuve=" + epreuve + "]";
	}

	/** Constructeur
	 * @param id
	 * @param or
	 * @param argent
	 * @param bronze
	 * @param athletes
	 * @param epreuve
	 * @author :Marine Desmier
	 */
	public Medaille(int id, Boolean or, Boolean argent, Boolean bronze, List<Athlete> athletes, Epreuve epreuve) {
		super();
		this.id = id;
		this.or = or;
		this.argent = argent;
		this.bronze = bronze;
		this.athletes = athletes;
		this.epreuve = epreuve;
	}

	/**
	 * Getter pour l'attribut id 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut or 
	 * @return the or
	 */
	public Boolean getOr() {
		return or;
	}

	/**
	 * Setter pour l'attribut or
	 * @param or the or to set
	 */
	public void setOr(Boolean or) {
		this.or = or;
	}

	/**
	 * Getter pour l'attribut argent 
	 * @return the argent
	 */
	public Boolean getArgent() {
		return argent;
	}

	/**
	 * Setter pour l'attribut argent
	 * @param argent the argent to set
	 */
	public void setArgent(Boolean argent) {
		this.argent = argent;
	}

	/**
	 * Getter pour l'attribut bronze 
	 * @return the bronze
	 */
	public Boolean getBronze() {
		return bronze;
	}

	/**
	 * Setter pour l'attribut bronze
	 * @param bronze the bronze to set
	 */
	public void setBronze(Boolean bronze) {
		this.bronze = bronze;
	}

	/**
	 * Getter pour l'attribut athletes 
	 * @return the athletes
	 */
	public List<Athlete> getAthletes() {
		return athletes;
	}

	/**
	 * Setter pour l'attribut athletes
	 * @param athletes the athletes to set
	 */
	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}

	/**
	 * Getter pour l'attribut epreuve 
	 * @return the epreuve
	 */
	public Epreuve getEpreuve() {
		return epreuve;
	}

	/**
	 * Setter pour l'attribut epreuve
	 * @param epreuve the epreuve to set
	 */
	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}
	
	
}
