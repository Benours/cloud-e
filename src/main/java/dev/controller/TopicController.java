package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.service.TopicService;

@RestController
@RequestMapping("topics")
public class TopicController {

	private TopicService topicService;

	public TopicService getTopicService() {
		return topicService;
	}
	
	@GetMapping("topics/{id}")
	public ResponseEntity<?> topic(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.topicService.findTopic(id));
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	
}
