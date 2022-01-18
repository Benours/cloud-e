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
@RequestMapping("/api/topics")
public class TopicController {

	private TopicService topicService;

	public TopicService getTopicService() {
		return topicService;
	}

	@GetMapping("/api/topics/{id}")
	public ResponseEntity<?> topic(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findTopic(id));
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	
	@PostMapping
	public ResponseEntity<?> createTopic(@RequestBody Topic topicToCreate) {
		return ResponseEntity.ok().body(this.topicService.createTopic(topicToCreate));
	}
	
	@PostMapping("/api/topics")
	public ResponseEntity<?> likeTopic(@PathVariable Integer id, @RequestBody Topic topicToLike) {
		Topic topic = this.topicService.findTopic(id).get();
		this.topicService.update(topic, topicToLike);
		return ResponseEntity.ok().body(topic);
	}
}
