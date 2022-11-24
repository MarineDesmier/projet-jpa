package fr.diginamic.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="langue")
public class Langue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LANGUE")
	private int id;
	
	@Column(name = "NOM", nullable = false, length = 50)
	private String nom;

	@Column(name = "CODE_CIO", nullable = false, length = 3)
	private String code_cio;
	
	@ManyToMany
	@JoinTable(name = "traduction_langue",
			joinColumns = @JoinColumn(name = "ID_LANG", referencedColumnName = "ID_LANGUE"),
			inverseJoinColumns = @JoinColumn(name = "ID_TRAD", referencedColumnName = "ID_TRADUCTION"))
	private List<Traduction> traductions = new ArrayList<Traduction>();

	public Langue() {}

	@Override
	public String toString() {
		return "Langue [id=" + id + ", nom=" + nom + ", code_cio=" + code_cio + ", traductions=" + traductions + "]";
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
	 * Getter pour l'attribut traductions 
	 * @return the traductions
	 */
	public List<Traduction> getTraductions() {
		return traductions;
	}

	/**
	 * Setter pour l'attribut traductions
	 * @param traductions the traductions to set
	 */
	public void setTraductions(List<Traduction> traductions) {
		this.traductions = traductions;
	}

	
}
