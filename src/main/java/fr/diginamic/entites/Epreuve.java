package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.diginamic.enums.Distinction;

@Entity
@Table(name="epreuve")
public class Epreuve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EPREUVE")
	private int id;

	@Column(name = "LABEL", nullable = false, length = 150)
	private String label;
	
	@Column(name = "DISTINCTION")
	@Enumerated(EnumType.STRING)
	private Distinction distinction;
	
	@ManyToOne
	@JoinColumn(name = "ID_JEUX")
	private Jeux jeu;
	
	@OneToMany(mappedBy = "epreuve")
	private List<Medaille> medailles = new ArrayList<Medaille>();
	
	@ManyToOne
	@JoinColumn(name = "ID_SPORT")
	private Sport sport;

	@ManyToMany(mappedBy = "epreuves")
	private List<Athlete> athletes;
	
	@ManyToOne
	@JoinColumn(name = "ID_TRADUCTION")
	private Traduction traductionEpreuve;
	
	public Epreuve() {}

	@Override
	public String toString() {
		return "Epreuve [id=" + id + ", label=" + label + ", distinction=" + distinction + ", jeu=" + jeu
				+ ", medailles=" + medailles + ", sport=" + sport + ", athletes=" + athletes + ", traductionEpreuve="
				+ traductionEpreuve + "]";
	}

	/** Constructeur
	 * @param id
	 * @param label
	 * @param distinction
	 * @param jeu
	 * @param medailles
	 * @param sport
	 * @param athletes
	 * @param traductionEpreuve
	 * @author :Marine Desmier
	 */
	public Epreuve(int id, String label, Distinction distinction, Jeux jeu, List<Medaille> medailles, Sport sport,
			List<Athlete> athletes, Traduction traductionEpreuve) {
		super();
		this.id = id;
		this.label = label;
		this.distinction = distinction;
		this.jeu = jeu;
		this.medailles = medailles;
		this.sport = sport;
		this.athletes = athletes;
		this.traductionEpreuve = traductionEpreuve;
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
	 * Getter pour l'attribut label 
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Setter pour l'attribut label
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Getter pour l'attribut distinction 
	 * @return the distinction
	 */
	public Distinction getDistinction() {
		return distinction;
	}

	/**
	 * Setter pour l'attribut distinction
	 * @param distinction the distinction to set
	 */
	public void setDistinction(Distinction distinction) {
		this.distinction = distinction;
	}

	/**
	 * Getter pour l'attribut jeu 
	 * @return the jeu
	 */
	public Jeux getJeu() {
		return jeu;
	}

	/**
	 * Setter pour l'attribut jeu
	 * @param jeu the jeu to set
	 */
	public void setJeu(Jeux jeu) {
		this.jeu = jeu;
	}

	/**
	 * Getter pour l'attribut medailles 
	 * @return the medailles
	 */
	public List<Medaille> getMedailles() {
		return medailles;
	}

	/**
	 * Setter pour l'attribut medailles
	 * @param medailles the medailles to set
	 */
	public void setMedailles(List<Medaille> medailles) {
		this.medailles = medailles;
	}

	/**
	 * Getter pour l'attribut sport 
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * Setter pour l'attribut sport
	 * @param sport the sport to set
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
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
	 * Getter pour l'attribut traductionEpreuve 
	 * @return the traductionEpreuve
	 */
	public Traduction getTraductionEpreuve() {
		return traductionEpreuve;
	}

	/**
	 * Setter pour l'attribut traductionEpreuve
	 * @param traductionEpreuve the traductionEpreuve to set
	 */
	public void setTraductionEpreuve(Traduction traductionEpreuve) {
		this.traductionEpreuve = traductionEpreuve;
	}

}
