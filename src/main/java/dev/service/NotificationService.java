package dev.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.entity.Notification;
import dev.repository.NotificationRepository;

@Service
public class NotificationService {

	private NotificationRepository notificationRepository;

	public NotificationService(NotificationRepository notificationRepository) {
		super();
		this.notificationRepository = notificationRepository;
	}

	public NotificationRepository getNotificationRepository() {
		return notificationRepository;
	}

	public void setNotificationRepository(NotificationRepository notificationRepository) {
		this.notificationRepository = notificationRepository;
	}
	
	public Optional<Notification> findNotification(Integer id) {
		return this.notificationRepository.findById(id);
	}

}
