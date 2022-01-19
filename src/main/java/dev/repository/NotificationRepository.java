package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
