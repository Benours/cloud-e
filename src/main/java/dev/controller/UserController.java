package dev.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Adresse;
import dev.entity.User;
import dev.entity.UserDTO;
import dev.entity.Ville;
import dev.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	private UserService userService;

	/**
	 * @param userService
	 */
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<?> connection(@RequestParam String email, @RequestParam String motDePasse) {
		return ResponseEntity.ok().body(this.userService.findUserByEmailAndMotDePasse(email, motDePasse));
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> user(@PathVariable Integer id) {
		Optional<User> user = this.userService.findUsers(id);
		if (user.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("L'utilisateur n'existe pas");
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("update/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody UserDTO userDTO) {
		User user = this.userService.findUsers(id).get();
		this.userService.newAdresse(userDTO.getAdresse(), user);
		this.userService.addAdresse(user, userDTO.getAdresse());
		this.userService.update(user, userDTO);
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody User userToCreate) {
		return ResponseEntity.ok().body(this.userService.createUser(userToCreate));
	}
	
//	@PostMapping("addAdresse/{id}")
//	public ResponseEntity<?> addAdresse(@PathVariable Integer id, ) {
//		User user = this.userService.findUsers(id).get();
//		this.userService.newAdresse(adresse);
//		return ResponseEntity.ok().body(this.userService.addAdresse(user, adresse));
//	}
		
} 
