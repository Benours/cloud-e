package dev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numeroRue;
	private String complementRue;
	private String nomRue;
	private String nomVille;
	private int codePostal;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	/**
	 * @param id
	 * @param numeroRue
	 * @param complementRue
	 * @param nomRue
	 * @param nomVille
	 * @param codePostal
	 */
	public Adresse(int numeroRue, String complementRue, String nomRue, String nomVille, int codePostal) {
		this.numeroRue = numeroRue;
		this.complementRue = complementRue;
		this.nomRue = nomRue;
		this.nomVille = nomVille;
		this.codePostal = codePostal;
	}

	/**
	 * 
	 */
	public Adresse() {
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the numeroRue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/**
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * @return the complementRue
	 */
	public String getComplementRue() {
		return complementRue;
	}

	/**
	 * @param complementRue the complementRue to set
	 */
	public void setComplementRue(String complementRue) {
		this.complementRue = complementRue;
	}

	/**
	 * @return the nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * @param nomRue the nomRue to set
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adresse [id=");
		builder.append(id);
		builder.append(", numeroRue=");
		builder.append(numeroRue);
		builder.append(", complementRue=");
		builder.append(complementRue);
		builder.append(", nomRue=");
		builder.append(nomRue);
		builder.append(", nomVille=");
		builder.append(nomVille);
		builder.append(", codePostal=");
		builder.append(codePostal);
		builder.append("]");
		return builder.toString();
	}
	
	
}
