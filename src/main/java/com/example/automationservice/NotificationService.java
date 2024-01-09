package com.example.automationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "notificationService", url = "http://localhost:8082")
public interface NotificationService {
    @PostMapping("/notify")
    Map<String, String> noti(@RequestBody DeviceDetails deviceDetails);
}
