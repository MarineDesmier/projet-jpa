package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipe")
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EQUIPE")
	private int id;

	@Column(name = "NOM", nullable = false, length = 75)
	private String nom;
	
	@Column(name = "CODE_ISO", nullable = false, length = 3)
	private String code_iso;
	
	// plusieurs equipes réprésente un pays
	@ManyToOne
	@JoinColumn(name = "ID_PAYS")
	private Pays pays;
	
	public Equipe() {}

	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nom=" + nom + ", code_iso=" + code_iso + ", pays=" + pays + "]";
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
	 * Getter pour l'attribut pays 
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
