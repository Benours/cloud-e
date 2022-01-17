package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.entity.Todo;
import dev.repository.MeteoRepository;

@Service
public class MeteoService {
	
	private MeteoRepository meteoRepository;

	public MeteoService(MeteoRepository meteoRepository) {
		super();
		this.meteoRepository = meteoRepository;
	}

}
