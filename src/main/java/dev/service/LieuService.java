package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.entity.Lieu;
import dev.entity.Todo;
import dev.repository.LieuRepository;
import dev.repository.TodoRepository;

@Service
public class LieuService {
	
	private LieuRepository lieuRepository;
	
	public LieuService(LieuRepository lieuRepository) {
        this.lieuRepository = lieuRepository;
    }

    
    @Transactional
    public Lieu createLieu(Lieu lieuACreer) {
        return this.lieuRepository.save(lieuACreer);
    }
	

}
