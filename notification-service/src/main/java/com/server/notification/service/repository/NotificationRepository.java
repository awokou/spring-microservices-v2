package com.server.notification.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.notification.service.entity.Notification;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, String> {
    List<Notification> findAllByUserIdOrderByCreationTimestampDesc(String id);
}
