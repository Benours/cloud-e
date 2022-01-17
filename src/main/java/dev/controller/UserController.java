package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.User;
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
	
	@GetMapping("{id}")
	public ResponseEntity<?> user(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.userService.findUsers(id));
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody User userToCreate) {
		return ResponseEntity.ok().body(this.userService.createUser(userToCreate));
	}
} 
