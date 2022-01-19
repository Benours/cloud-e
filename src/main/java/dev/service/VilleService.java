package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.entity.Ville;
import dev.repository.VilleRepository;

@Service
public class VilleService {
	
	private VilleRepository villeRepository;
	
	public VilleService(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    
    @Transactional
    public Ville createVille(Ville villeACreer) {
        return this.villeRepository.save(villeACreer);
    }
	

}
