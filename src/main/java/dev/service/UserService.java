package dev.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.entity.Adresse;
import dev.entity.User;
import dev.entity.UserDTO;
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
	public User update(User user, UserDTO userDTO) {
		// TODO Auto-generated method stub
		if (userDTO.getNom() != null)
		user.setNom(userDTO.getNom());
		if (userDTO.getPrenom() != null)
		user.setPrenom(userDTO.getPrenom());
		if (userDTO.getEmail() != null)
		user.setEmail(userDTO.getEmail());
		if (userDTO.getMotDePasse() != null)
		user.setMotDePasse(userDTO.getMotDePasse());
		return user;
	}
	
	@Transactional
	public void newAdresse(Adresse adresse, User user) {
		adresse.setUser(user);
		this.adresseRepository.save(adresse);
	}

	@Transactional
	public void addAdresse(User user, Adresse adresse) {
		// TODO Auto-generated method stub
		List<Adresse> liste = user.getAdresses();
		liste.add(adresse);
		user.setAdresses(liste);
	}

	public User findUserByEmailAndMotDePasse(String email, String motDePasse) {
		// TODO Auto-generated method stub
		return this.userRepository.findUserByEmailAndMotDePasse(email, motDePasse);
	}

}
