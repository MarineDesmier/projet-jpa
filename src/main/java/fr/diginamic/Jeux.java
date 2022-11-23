package fr.diginamic;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.diginamic.enums.Saison;

@Entity
@Table(name="edition_jeux")
public class Jeux {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_JEUX")
	private int id;

	@Column(name = "annee", nullable = false)
	private String annee;
	
	@Enumerated(EnumType.STRING)
	private Saison saison;

	@Column(name = "ville", nullable = false, length = 100)
	private String ville;
	
	@ManyToMany
	@JoinTable(name = "jeux_athlete",
	joinColumns = @JoinColumn(name ="ID_JEUX", referencedColumnName = "ID_JEUX"),
	inverseJoinColumns = @JoinColumn(name = "ID_ATHLETE", referencedColumnName = "ID_ATH"))
	private List<Athlete> athletes = new ArrayList<Athlete>();
	
	@OneToMany(mappedBy = "jeu")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	public Jeux() {}

	@Override
	public String toString() {
		return "Jeux [id=" + id + ", annee=" + annee + ", saison=" + saison + ", ville=" + ville + ", athletes="
				+ athletes + ", epreuves=" + epreuves + "]";
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
	 * Getter pour l'attribut annee 
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}

	/**
	 * Setter pour l'attribut annee
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}

	/**
	 * Getter pour l'attribut saison 
	 * @return the saison
	 */
	public Saison getSaison() {
		return saison;
	}

	/**
	 * Setter pour l'attribut saison
	 * @param saison the saison to set
	 */
	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	/**
	 * Getter pour l'attribut ville 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour l'attribut ville
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
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
	 * Getter pour l'attribut epreuves 
	 * @return the epreuves
	 */
	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	/**
	 * Setter pour l'attribut epreuves
	 * @param epreuves the epreuves to set
	 */
	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

}
