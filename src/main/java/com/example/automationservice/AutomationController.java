package com.example.automationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AutomationController {
    private final NotificationService notificationService;

    @Autowired
    public AutomationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/automation")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleRegistrationRequests(@RequestBody DeviceDetails deviceDetails) {
        System.out.println("Device Details received at Registration Controller: " + deviceDetails);
        return notificationService.noti(deviceDetails);
    }
}
