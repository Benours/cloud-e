package dev.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.Size;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "meteo") // Optionnel
public class Meteo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	private int temperature;
	private int humidite;
	private LocalDate date;
	private int direction_vent;
	private int vitesse_vent;
	private int visibilite;
	private int sommaire;
	private int pression_atmo;
	private int indice_uv;
	private int couverture_nuageuse;
	
	@OneToOne
	private Ville ville;

	public Meteo() {
	}

	public Meteo(int temperature, int humidite, LocalDate date, int direction_vent, int vitesse_vent, int visibilite,
			int sommaire, int pression_atmo, int indice_uv, int couverture_nuageuse) {
		super();
		this.temperature = temperature;
		this.humidite = humidite;
		this.date = date;
		this.direction_vent = direction_vent;
		this.vitesse_vent = vitesse_vent;
		this.visibilite = visibilite;
		this.sommaire = sommaire;
		this.pression_atmo = pression_atmo;
		this.indice_uv = indice_uv;
		this.couverture_nuageuse = couverture_nuageuse;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidite() {
		return humidite;
	}

	public void setHumidite(int humidite) {
		this.humidite = humidite;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getDirection_vent() {
		return direction_vent;
	}

	public void setDirection_vent(int direction_vent) {
		this.direction_vent = direction_vent;
	}

	public int getVitesse_vent() {
		return vitesse_vent;
	}

	public void setVitesse_vent(int vitesse_vent) {
		this.vitesse_vent = vitesse_vent;
	}

	public int getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(int visibilite) {
		this.visibilite = visibilite;
	}

	public int getSommaire() {
		return sommaire;
	}

	public void setSommaire(int sommaire) {
		this.sommaire = sommaire;
	}

	public int getPression_atmo() {
		return pression_atmo;
	}

	public void setPression_atmo(int pression_atmo) {
		this.pression_atmo = pression_atmo;
	}

	public int getIndice_uv() {
		return indice_uv;
	}

	public void setIndice_uv(int indice_uv) {
		this.indice_uv = indice_uv;
	}

	public int getCouverture_nuageuse() {
		return couverture_nuageuse;
	}

	public void setCouverture_nuageuse(int couverture_nuageuse) {
		this.couverture_nuageuse = couverture_nuageuse;
	}
	
	public int getVille_id() {
		return ville_id;
	}

	public void setVille_id(int ville_id) {
		this.ville_id = ville_id;
	}
	
}
