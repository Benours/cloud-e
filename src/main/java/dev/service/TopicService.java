package dev.service;

import org.springframework.stereotype.Service;

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
}