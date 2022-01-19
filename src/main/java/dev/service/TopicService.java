package dev.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entity.Message;
import dev.entity.Tag;
import dev.entity.Topic;
import dev.repository.TopicRepository;

@Service
public class TopicService {

	private TopicRepository topicRepository;

	public TopicService(TopicRepository topicRepository) {
		super();
		this.topicRepository = topicRepository;
	}

	public TopicRepository getTopicRepository() {
		return topicRepository;
	}

	public void setTopicRepository(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}

	public Optional<Topic> findTopic(Integer id) {
		return this.topicRepository.findById(id);
	}
	
	public Integer findLikes(Integer likes) {
		Topic topic = this.topicRepository.findById(likes).get();
		return topic.getLikes();
	}
	
	public List<Message> findMessages(Integer messages) {
		Topic topic = this.topicRepository.findById(messages).get();
		return topic.getMessages();
	}
	
	public List<Tag> findTag(Integer tag) {
		Topic topic = this.topicRepository.findById(tag).get();
		return topic.getTag();
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

	@Transactional
	public Topic update(Topic topic) {
		int cacheLike = topic.getLikes();
		cacheLike += 1;
		topic.setLikes(cacheLike);
		return topic;
	}
}