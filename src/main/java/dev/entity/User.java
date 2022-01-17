package dev.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private String isAdmin;
	
	@OneToMany(mappedBy = "user")
	private List<Adresse> adresses;
	
	@ManyToMany
	@JoinTable(name = "user_notification",
	joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_notification", referencedColumnName = "ID"))
	private List<Notification> notifications;
	
	@ManyToMany
	@JoinTable(name = "user_topic",
	joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_topic", referencedColumnName = "ID"))
	private List<Topic> topics;
	
	@ManyToMany
	@JoinTable(name = "user_ville",
	joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_ville", referencedColumnName = "ID"))
	private List<Ville> villes;
	
	@ManyToMany
	@JoinTable(name = "user_message",
	joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name = "id_message", referencedColumnName = "ID"))
	private List<Message> messages;

	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param motDePasse
	 * @param isAdmin
	 * @param adresses
	 * @param notifications
	 */
	public User(String nom, String prenom, String email, String motDePasse, String isAdmin, List<Adresse> adresses,
			List<Notification> notifications) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.isAdmin = isAdmin;
		this.adresses = adresses;
		this.notifications = notifications;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
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
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the isAdmin
	 */
	public String getIsAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the adresses
	 */
	public List<Adresse> getAdresses() {
		return adresses;
	}

	/**
	 * @param adresses the adresses to set
	 */
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	/**
	 * @return the notifications
	 */
	public List<Notification> getNotifications() {
		return notifications;
	}

	/**
	 * @param notifications the notifications to set
	 */
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", email=");
		builder.append(email);
		builder.append(", motDePasse=");
		builder.append(motDePasse);
		builder.append(", isAdmin=");
		builder.append(isAdmin);
		builder.append(", adresses=");
		builder.append(adresses.toString());
		builder.append(", notifications=");
		builder.append(notifications.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
