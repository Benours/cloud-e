package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.Message;
import dev.entity.Notification;
import dev.service.NotificationService;

@RestController
@RequestMapping("notifications")
public class NotificationController {

	private NotificationService notificationService;

	public NotificationController(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}

	@PostMapping
	public ResponseEntity<?> createMessage(@RequestBody Notification notificationToCreate) {
		return ResponseEntity.ok().body(this.notificationService.createNotif(notificationToCreate));
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<?> findNotification(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.notificationService.findNotification(id));
	}

}
