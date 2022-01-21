package dev.controller;

import java.util.List;

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
	
	@GetMapping("{id}")
	public ResponseEntity<?> findMessage(@PathVariable Integer id) {
		Message message = this.messageService.findMessage(id);
		return ResponseEntity.ok().body(message.toString());
	}
	
	@GetMapping("likes/{id}")
	public ResponseEntity<?> findLikes(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.messageService.findLikes(id));
	}

	@PostMapping
	public ResponseEntity<?> createMessage(@RequestBody Message messageToCreate) {
		return ResponseEntity.ok().body(this.messageService.createMessage(messageToCreate));
	}
	
	@GetMapping("topic/{id}")
	public ResponseEntity<?> getTopicMessages(@PathVariable Integer id){
		List<Message> list = this.messageService.findMessageByTopicId(id);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("likes/{id}")
	public ResponseEntity<?> likeMessage(@PathVariable Integer id) {
		Message message = this.messageService.findMessage(id);
		
		this.messageService.update(message);
		return ResponseEntity.ok().body(message);
	}
}
