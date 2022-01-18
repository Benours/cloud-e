package dev.service;

import org.springframework.stereotype.Service;

import dev.repository.MeteoRepository;

@Service
public class MeteoService {
	
	private MeteoRepository meteoRepository;

	public MeteoService(MeteoRepository meteoRepository) {
		super();
		this.setMeteoRepository(meteoRepository);
	}

	public MeteoRepository getMeteoRepository() {
		return meteoRepository;
	}

	public void setMeteoRepository(MeteoRepository meteoRepository) {
		this.meteoRepository = meteoRepository;
	}
}
