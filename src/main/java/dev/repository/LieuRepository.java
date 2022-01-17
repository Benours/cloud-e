package dev.repository;

import dev.entity.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LieuRepository extends JpaRepository<Lieu, Integer> {
}
