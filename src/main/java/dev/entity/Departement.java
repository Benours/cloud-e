package dev.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private Lieu lieu;
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public List<Ville> getVilles() {
		return villes;
	}
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	@ManyToOne
	@JoinColumn(name = "id_region")
	private Region region;
	
	@OneToMany(mappedBy = "departement")
	private List<Ville> villes;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
}
