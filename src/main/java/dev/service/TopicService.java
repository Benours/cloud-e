package dev.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Topic;
import dev.repository.TopicRepository;

@Service
public class TopicService {
	
	private TopicRepository topicRepository;

	public TopicRepository getTopicRepository() {
		return topicRepository;
	}

	public void setTopicRepository(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}

	public Optional<Topic> findTopic(Integer id) {
		return this.topicRepository.findById(id);
	}
}