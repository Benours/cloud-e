package dev.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QualiteAir {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	private LocalDate date;
	private int pm25;
	private int pm10;
	private int so2;
	private int no2;
	private int ozone;
	private int co;
	private int aqi;
	
	@OneToOne
	private Ville ville;
	
	public QualiteAir() {
	}

	public QualiteAir(Integer id, LocalDate date, int pm25, int pm10, int so2, int no2, int ozone, int co, int aqi,
			Ville ville) {
		super();
		this.id = id;
		this.date = date;
		this.pm25 = pm25;
		this.pm10 = pm10;
		this.so2 = so2;
		this.no2 = no2;
		this.ozone = ozone;
		this.co = co;
		this.aqi = aqi;
		this.ville = ville;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPm25() {
		return pm25;
	}

	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}

	public int getPm10() {
		return pm10;
	}

	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}

	public int getSo2() {
		return so2;
	}

	public void setSo2(int so2) {
		this.so2 = so2;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getOzone() {
		return ozone;
	}

	public void setOzone(int ozone) {
		this.ozone = ozone;
	}

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}

	public int getAqi() {
		return aqi;
	}

	public void setAqi(int aqi) {
		this.aqi = aqi;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}	

}
