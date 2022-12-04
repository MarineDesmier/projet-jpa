package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="traduction")
public class Traduction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TRADUCTION")
	private int id;
	
	@Column(name = "TRADUCTION", nullable = false, length = 150 )
	private String traduction;
	
	@OneToMany(mappedBy = "traductionEpreuve")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@OneToMany(mappedBy = "traductionSport")
	private List<Sport> sport = new ArrayList<Sport>();
	
	@OneToMany(mappedBy = "traductionPays")
	private List<Pays> pays = new ArrayList<Pays>();
	
	@ManyToMany(mappedBy = "traductions")
	private List<Langue> langues;

	@Override
	public String toString() {
		return "Traduction [id=" + id + ", traduction=" + traduction + ", epreuves=" + epreuves + ", sport=" + sport
				+ ", pays=" + pays + ", langues=" + langues + "]";
	}

	/** Constructeur
	 * @param id
	 * @param traduction
	 * @param epreuves
	 * @param sport
	 * @param pays
	 * @param langues
	 * @author :Marine Desmier
	 */
	public Traduction(int id, String traduction, List<Epreuve> epreuves, List<Sport> sport, List<Pays> pays,
			List<Langue> langues) {
		super();
		this.id = id;
		this.traduction = traduction;
		this.epreuves = epreuves;
		this.sport = sport;
		this.pays = pays;
		this.langues = langues;
	}


	public Traduction() {
		// TODO Auto-generated constructor stub
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
	 * Getter pour l'attribut traduction 
	 * @return the traduction
	 */
	public String getTraduction() {
		return traduction;
	}

	/**
	 * Setter pour l'attribut traduction
	 * @param traduction the traduction to set
	 */
	public void setTraduction(String traduction) {
		this.traduction = traduction;
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

	/**
	 * Getter pour l'attribut sport 
	 * @return the sport
	 */
	public List<Sport> getSport() {
		return sport;
	}

	/**
	 * Setter pour l'attribut sport
	 * @param sport the sport to set
	 */
	public void setSport(List<Sport> sport) {
		this.sport = sport;
	}

	/**
	 * Getter pour l'attribut pays 
	 * @return the pays
	 */
	public List<Pays> getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * @param pays the pays to set
	 */
	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut langues 
	 * @return the langues
	 */
	public List<Langue> getLangues() {
		return langues;
	}

	/**
	 * Setter pour l'attribut langues
	 * @param langues the langues to set
	 */
	public void setLangues(List<Langue> langues) {
		this.langues = langues;
	}
	
	
}
