package dev.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entity.Message;
import dev.repository.MessageRepository;



@Service
public class MessageService {
	
	private MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		super();
		this.messageRepository = messageRepository;
	}
	
	public MessageRepository getMessageRepository() {
		return messageRepository;
	}

	public void setMessageRepository(MessageRepository MessageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public Optional<Message> findMessage(Integer id) {
		return this.messageRepository.findById(id);
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

}
