package dev.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String text;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "id_topic")
	private Topic topic;
	
	/**
	 * @param text
	 * @param date
	 */
	public Message(String text, LocalDate date) {
		this.text = text;
		this.date = date;
	}
	/**
	 * 
	 */
	public Message() {
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
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	 
}
