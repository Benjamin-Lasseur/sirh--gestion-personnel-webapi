package dev.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** banque : String */
	private String nom;
	/** bic : String */
	private String bic;
	/** iban : String */
	private String iban;

	public Banque() {
		// TODO Auto-generated constructor stub
	}

	public Banque(String nom, String bic, String iban) {
		this.nom = nom;
		this.bic = bic;
		this.iban = iban;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * @param bic
	 *            the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}

	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * @param iban
	 *            the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
