package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sport")
public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SPORT")
	private int id;

	@Column(name = "label", nullable = false, length = 100)
	private String label;
	
	@OneToMany(mappedBy = "sport")
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@ManyToOne
	@JoinColumn(name = "ID_TRADUCTION")
	private Traduction traductionSport;

	public Sport() {}

	@Override
	public String toString() {
		return "Sport [id=" + id + ", label=" + label + ", epreuves=" + epreuves + ", traductionSport="
				+ traductionSport + "]";
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
	 * Getter pour l'attribut traductionSport 
	 * @return the traductionSport
	 */
	public Traduction getTraductionSport() {
		return traductionSport;
	}

	/**
	 * Setter pour l'attribut traductionSport
	 * @param traductionSport the traductionSport to set
	 */
	public void setTraductionSport(Traduction traductionSport) {
		this.traductionSport = traductionSport;
	}
	
}
