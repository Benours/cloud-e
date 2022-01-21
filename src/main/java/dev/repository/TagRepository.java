package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {
	
}
