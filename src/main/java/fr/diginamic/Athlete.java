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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.diginamic.enums.Sexe;

@Entity
@Table(name="athlete")
public class Athlete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ATHLETE")
	private int id;

	@Column(name = "NOM", nullable = false, length = 150)
	private String nom;
	
	@Column(name = "AGE", nullable = true)
	private String age;
	
	@Column(name = "TAILLE", nullable = true)
	private float taille;
	
	@Column(name = "POIDS", nullable = true)
	private float poids;
	
	@Enumerated(EnumType.STRING)
	private Sexe sexe;
	
	@ManyToOne // plusieurs athlètes représente un pays
	@JoinColumn(name = "ID_PAYS")
	private Pays paysAthlete;
	
	@ManyToMany
	@JoinTable(name = "athlete_epreuve",
			joinColumns = @JoinColumn(name ="ID_ATH", referencedColumnName = "ID_ATHLETE"),
			inverseJoinColumns = @JoinColumn(name = "ID_EPR", referencedColumnName = "ID_EPREUVE"))
	private List<Epreuve> epreuves = new ArrayList<Epreuve>();
	
	@ManyToMany
	@JoinTable(name = "athlete_medaille",
			joinColumns = @JoinColumn(name ="ID_ATH", referencedColumnName = "ID_ATHLETE"),
			inverseJoinColumns = @JoinColumn(name = "ID_MED", referencedColumnName = "ID_MEDAILLE"))
	private List<Medaille> medailles = new ArrayList<Medaille>();
	
	@ManyToMany(mappedBy = "athletes")
	private List<Jeux> jeux;

	public Athlete() {}

	@Override
	public String toString() {
		return "Athlete [id=" + id + ", nom=" + nom + ", age=" + age + ", taille=" + taille + ", poids=" + poids
				+ ", sexe=" + sexe + ", pays=" + paysAthlete + ", epreuves=" + epreuves + ", medailles=" + medailles
				+ ", jeux=" + jeux + "]";
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
	 * Getter pour l'attribut nom 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut age 
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Setter pour l'attribut age
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * Getter pour l'attribut taille 
	 * @return the taille
	 */
	public float getTaille() {
		return taille;
	}

	/**
	 * Setter pour l'attribut taille
	 * @param taille the taille to set
	 */
	public void setTaille(float taille) {
		this.taille = taille;
	}

	/**
	 * Getter pour l'attribut poids 
	 * @return the poids
	 */
	public float getPoids() {
		return poids;
	}

	/**
	 * Setter pour l'attribut poids
	 * @param poids the poids to set
	 */
	public void setPoids(float poids) {
		this.poids = poids;
	}

	/**
	 * Getter pour l'attribut sexe 
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}

	/**
	 * Setter pour l'attribut sexe
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	/**
	 * Getter pour l'attribut pays 
	 * @return the pays
	 */
	public Pays getPays() {
		return paysAthlete;
	}

	/**
	 * Setter pour l'attribut pays
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.paysAthlete = pays;
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
	 * Getter pour l'attribut jeux 
	 * @return the jeux
	 */
	public List<Jeux> getJeux() {
		return jeux;
	}

	/**
	 * Setter pour l'attribut jeux
	 * @param jeux the jeux to set
	 */
	public void setJeux(List<Jeux> jeux) {
		this.jeux = jeux;
	}

}
