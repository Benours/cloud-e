package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email = :email and u.motDePasse = :mdp")
	User findUserByEmailAndMotDePasse(@Param("email") String email, @Param("mdp") String motDePasse);
	
}
