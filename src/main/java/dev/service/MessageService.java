package dev.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entity.Message;
import dev.entity.Topic;
import dev.repository.MessageRepository;
import dev.repository.TopicRepository;



@Service
public class MessageService {
	
	private MessageRepository messageRepository;
	private TopicRepository topicRepository;
	
	public MessageService(MessageRepository messageRepository,TopicRepository topicRepository) {
		super();
		this.messageRepository = messageRepository;
		this.topicRepository = topicRepository;
	}
	
	public MessageRepository getMessageRepository() {
		return messageRepository;
	}

	public void setMessageRepository(MessageRepository MessageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public Message findMessage(Integer id) {
		Message m = this.messageRepository.findById(id).get();
		return m;
		
	}
	
	public Integer findLikes(Integer likes) {
		Message message = this.messageRepository.findById(likes).get();
		return message.getLikes();
	}
	
	public Message save(Message message) {
		return messageRepository.save(message);
	}
	
	@Transactional
	public Message createMessage(Message messageToCreate) {
		return this.messageRepository.save(messageToCreate);
	}

	@Transactional
	public Message update(Message message) {
		int cacheLike = message.getLikes();
		cacheLike += 1;
		message.setLikes(cacheLike);
		return message;
	}
	
	public List<Message> findMessageByTopicId(Integer topicId) {
		Topic topic = this.topicRepository.findById(topicId).get();
		
		return this.messageRepository.findMessageByTopicId(topic.getId());
	}

}
