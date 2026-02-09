package com.server.notification.service.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SendNotificationDto {
    private String userId;
    private String offerId;
    private String message;
}
