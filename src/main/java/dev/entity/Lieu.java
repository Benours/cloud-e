package dev.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;

	@OneToMany(mappedBy = "lieu")
	private List<Region> regions;
	@OneToMany(mappedBy = "lieu")
	private List<Departement> departements;
	@OneToMany(mappedBy = "lieu")
	private List<Ville> villes;

	public Lieu() {
	}

	public Lieu(Integer id, String nom, List<Region> regions, List<Departement> departements, List<Ville> villes) {
		super();
		this.id = id;
		this.nom = nom;
		this.regions = regions;
		this.departements = departements;
		this.villes = villes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
