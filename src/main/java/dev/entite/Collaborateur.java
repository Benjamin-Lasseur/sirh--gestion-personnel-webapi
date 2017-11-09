package dev.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Collaborateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/** nom : String */

	private String nom;
	/** prenom : String */

	private String prenom;
	/** fonction : String */

	private String fonction;
	/** departement : String */

	@ManyToOne
	@JoinColumn(name = "ID_DEP")
	private Departement departement;
	/** email : String */
	private String email;
	/** telephone : String */

	private String telephone;
	/** matricule : int */
	private Integer matricule;
	/** numSecu : String */
	private String numSecu;
	/** photo : String */
	private String photo;
	/** dateHeureCreation : ZonedDateTime */
	private LocalDate dateHeureCreation;
	/** dateDeNaissance : LocalDate */
	private LocalDate dateDeNaissance;
	/** adresse : String */
	private String adresse;
	/** actif : boolean */
	private boolean actif;
	/** intitulePoste : String */
	private String intitulePoste;
	@ManyToOne
	private Banque banque;

	/**
	 * Constructeur de collaborateurs dummys (pour l'affichage de la page
	 * d'acceuil)
	 * 
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param departement
	 * @param email
	 * @param telephone
	 */
	public Collaborateur(int matricule, String nom, String prenom, String fonction, Departement departement,
			String email, String telephone, Banque banque) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.departement = departement;
		this.email = nom.toLowerCase() + "." + prenom.toLowerCase() + "@email.com";
		this.telephone = telephone;
		this.actif = true;
		this.photo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpmLbYqzTEg3Pl5Vw_8k1O4UtUHPlIgZ4qK-8PGRNahxqauPbj";
		this.dateDeNaissance = LocalDate.now();
		this.numSecu = "Non renseigné";
		this.dateHeureCreation = LocalDate.now();
		this.banque = banque;
	}

	public Collaborateur() {
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * @param fonction
	 *            the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	/**
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**
	 * @param departement
	 *            the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the numSecu
	 */
	public String getNumSecu() {
		return numSecu;
	}

	/**
	 * @param numSecu
	 *            the numSecu to set
	 */
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * @param dateDeNaissance
	 *            the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the actif
	 */
	public boolean isActif() {
		return actif;
	}

	/**
	 * @param actif
	 *            the actif to set
	 */
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	/**
	 * @return the intitulePoste
	 */
	public String getIntitulePoste() {
		return intitulePoste;
	}

	/**
	 * @param intitulePoste
	 *            the intitulePoste to set
	 */
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
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

	/**
	 * @param banque
	 *            the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * @return the dateHeureCreation
	 */
	public LocalDate getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * @param dateHeureCreation
	 *            the dateHeureCreation to set
	 */
	public void setDateHeureCreation(LocalDate dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

}
