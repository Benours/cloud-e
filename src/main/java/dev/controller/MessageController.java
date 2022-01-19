package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Message;
import dev.service.MessageService;

@RestController
@RequestMapping("messages")
public class MessageController {
	
	private MessageService messageService;
	
	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	
	public MessageService getMessageService() {
		return messageService;
	}
	
	public void setMessageService(MessageService MessageService) {
		this.messageService = messageService;
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findMessage(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.messageService.findMessage(id));
	}
	
	@GetMapping("likes/{id}")
	public ResponseEntity<?> findLikes(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.messageService.findLikes(id));
	}

	@PostMapping
	public ResponseEntity<?> createMessage(@RequestBody Message messageToCreate) {
		return ResponseEntity.ok().body(this.messageService.createMessage(messageToCreate));
	}

	@PostMapping("likes/{id}")
	public ResponseEntity<?> likeMessage(@PathVariable Integer id) {
		Message message = this.messageService.findMessage(id).get();
		this.messageService.update(message);
		return ResponseEntity.ok().body(message);
	}
}
