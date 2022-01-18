package dev.service;

import java.util.Optional;

import javax.transaction.Transactional;

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

	public Topic findOne(int id) {
		return topicRepository.findById(id).get();
	}
	
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

    @Transactional
    public Topic createTopic(Topic topicToCreate) {
    	return this.topicRepository.save(topicToCreate);
    }
}