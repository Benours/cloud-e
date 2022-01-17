package dev.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entity.User;
import dev.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;

	/**
	 * @param repository
	 */
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Optional<User> findUsers(Integer id) {
		return this.userRepository.findById(id);
	}
	
	@Transactional
	public User createUser(User userToCreate) {
		return this.userRepository.save(userToCreate);
	}

}
