package dev.repository;

import dev.entity.Ville;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
	@Query("Select v from Ville v where v.nom = :nomVille")
	Optional<Ville> findByVille(@Param("nomVille")String nomVille);
}
