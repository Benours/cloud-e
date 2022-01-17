package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.entity.Meteo;

public interface MeteoRepository extends JpaRepository<Meteo, Integer>{
}
