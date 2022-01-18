package dev.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.entity.Adresse;
import dev.entity.User;
import dev.entity.Ville;
import dev.repository.AdresseRepository;
import dev.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	private AdresseRepository adresseRepository;

	/**
	 * @param repository
	 */
	public UserService(UserRepository userRepository, AdresseRepository adresseRepository) {
		this.userRepository = userRepository;
		this.adresseRepository = adresseRepository;
	}
	
	public Optional<User> findUsers(Integer id) {
		return this.userRepository.findById(id);
	}
	
	@Transactional
	public User createUser(User userToCreate) {
		return this.userRepository.save(userToCreate);
	}

	@Transactional
	public User update(User user, User userToModify) {
		// TODO Auto-generated method stub
		if (userToModify.getNom() != null)
		user.setNom(userToModify.getNom());
		if (userToModify.getPrenom() != null)
		user.setPrenom(userToModify.getPrenom());
		if (userToModify.getEmail() != null)
		user.setEmail(userToModify.getEmail());
		if (userToModify.getMotDePasse() != null)
		user.setMotDePasse(userToModify.getMotDePasse());
		return user;
	}
	
	@Transactional
	public void newAdresse(Adresse adresse) {
		this.adresseRepository.save(adresse);
	}

	@Transactional
	public User addAdresse(User user, Adresse adresse) {
		// TODO Auto-generated method stub
		List<Adresse> liste = user.getAdresses();
		liste.add(adresse);
		user.setAdresses(liste);
		return user;
	}

}
