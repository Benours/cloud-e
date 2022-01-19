package dev.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entity.QualiteAir;
import dev.repository.QualiteAirRepository;

@Service
public class QualiteAirService {
	
	private QualiteAirRepository qualiteAirRepository;
	
	public QualiteAirService(QualiteAirRepository qualiteAirRepository) {
		super();
		this.qualiteAirRepository = qualiteAirRepository;
	}
	
	public Optional<QualiteAir> findQualiteAir(Integer id) {
		return this.qualiteAirRepository.findById(id);
	}
	
	@Transactional
	public QualiteAir createQualiteAir(QualiteAir qualiteAirToCreate) {
		return this.qualiteAirRepository.save(qualiteAirToCreate);
	}
	
	// Ajout des indices de qualité de l'air ?

}
