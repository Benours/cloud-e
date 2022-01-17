package dev.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer numero;
	private Integer nbHabitants;
	
	@ManyToOne
	@JoinColumn(name = "id_departement")
	private Departement departement;
	
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieu;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
	
	 
}
