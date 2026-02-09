package com.server.notification.service.listeners;

import com.server.notification.service.dto.SendNotificationDto;
import com.server.notification.service.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotificationListener {

    private final NotificationService notificationService;

    @KafkaListener(topics = { "${spring.kafka.topic.name}" }, groupId = "${spring.kafka.consumer.group-id}")
    public void consume(final SendNotificationDto request) {
        log.info("Consumed message: {}", request.toString());
        notificationService.save(request);
    }
}