package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Topic;
import dev.service.TopicService;

@RestController
@RequestMapping("topics")
public class TopicController {

	private TopicService topicService;

	public TopicController(TopicService topicService) {
		super();
		this.topicService = topicService;
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findTopic(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findTopic(id));
	}
	
	@GetMapping("likes/{id}")
	public ResponseEntity<?> findLikes(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findLikes(id));
	}
	
	@GetMapping("messages/{id}")
	public ResponseEntity<?> findMessages(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findMessages(id));
	}
	
	@GetMapping("tag/{id}")
	public ResponseEntity<?> findTag(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findTag(id));
	}

	@PostMapping
	public ResponseEntity<?> createTopic(@RequestBody Topic topicToCreate) {
		return ResponseEntity.ok().body(this.topicService.createTopic(topicToCreate));
	}

	@PostMapping("likes/{id}")
	public ResponseEntity<?> likeTopic(@PathVariable Integer id) {
		Topic topic = this.topicService.findTopic(id).get();
		this.topicService.update(topic);
		return ResponseEntity.ok().body(topic);
	}
}
