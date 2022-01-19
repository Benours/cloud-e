package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dev.entity.Message;
import dev.entity.Topic;

public interface MessageRepository extends JpaRepository<Message, Integer>{
	
	@Query("Select m from Message m where m.topic.id = :topic")
	List<Message> findMessageByTopicId(@Param("topic")Integer topic);

}
