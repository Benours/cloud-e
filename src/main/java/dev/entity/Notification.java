package dev.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titre;
	private String text;

	@OneToMany(mappedBy = "notification")
	private List<Tag> tags;

	@ManyToMany(mappedBy = "notifications")
	private List<User> users;

	/**
	 * @param id
	 * @param titre
	 * @param text
	 */
	public Notification(String titre, String text) {
		this.titre = titre;
		this.text = text;
	}

	/**
	 * 
	 */
	public Notification() {
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Notification [id=");
		builder.append(id);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}

}
