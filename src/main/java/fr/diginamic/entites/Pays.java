package fr.diginamic.entites;

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
@Table(name="pays")
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PAYS")
	private int id;

	@Column(name = "NOM", nullable = false, length = 75)
	private String nom;
	
	@Column(name = "CODE_CIO", nullable = false, length = 3)
	private String code_cio;
	
	@Column(name = "CODE_ISO", nullable = true, length = 3)
	private String code_iso;
	
	@Column(name = "OBSOLETE", nullable = false, length = 3) 
	private String obsolete;
	
	// un pays est représenté par plusieurs athlètes
	@OneToMany(mappedBy = "paysAthlete") 
	private List<Athlete> athletes = new ArrayList<Athlete>();

	// un pays est représenté par plusieurs équipes
	@OneToMany(mappedBy = "pays")
	private List<Equipe> equipes = new ArrayList<Equipe>();
	
	@ManyToOne
	@JoinColumn(name = "ID_TRADUCTION")
	private Traduction traductionPays;
	
	public Pays() {}

	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + ", code_cio=" + code_cio + ", code_iso=" + code_iso + ", obsolete="
				+ obsolete + ", athletes=" + athletes + ", equipes=" + equipes + ", traductionPays=" + traductionPays
				+ "]";
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
	 * Getter pour l'attribut code_cio 
	 * @return the code_cio
	 */
	public String getCode_cio() {
		return code_cio;
	}

	/**
	 * Setter pour l'attribut code_cio
	 * @param code_cio the code_cio to set
	 */
	public void setCode_cio(String code_cio) {
		this.code_cio = code_cio;
	}

	/**
	 * Getter pour l'attribut code_iso 
	 * @return the code_iso
	 */
	public String getCode_iso() {
		return code_iso;
	}

	/**
	 * Setter pour l'attribut code_iso
	 * @param code_iso the code_iso to set
	 */
	public void setCode_iso(String code_iso) {
		this.code_iso = code_iso;
	}

	/**
	 * Getter pour l'attribut obsolete 
	 * @return the obsolete
	 */
	public String getObsolete() {
		return obsolete;
	}

	/**
	 * Setter pour l'attribut obsolete
	 * @param obsolete the obsolete to set
	 */
	public void setObsolete(String obsolete) {
		this.obsolete = obsolete;
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
	 * Getter pour l'attribut equipes 
	 * @return the equipes
	 */
	public List<Equipe> getEquipes() {
		return equipes;
	}

	/**
	 * Setter pour l'attribut equipes
	 * @param equipes the equipes to set
	 */
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	/**
	 * Getter pour l'attribut traductionPays 
	 * @return the traductionPays
	 */
	public Traduction getTraductionPays() {
		return traductionPays;
	}

	/**
	 * Setter pour l'attribut traductionPays
	 * @param traductionPays the traductionPays to set
	 */
	public void setTraductionPays(Traduction traductionPays) {
		this.traductionPays = traductionPays;
	}

	
}
