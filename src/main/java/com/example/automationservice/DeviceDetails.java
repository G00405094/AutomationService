package com.example.automationservice;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceDetails {
    @NotBlank(message = "Device ID cannot be blank")
    private String deviceId;

    @NotBlank(message = "Device Name cannot be blank")
    @Size(min = 2, max = 50, message = "Device Name must be between 2 and 50 characters")
    private String deviceName;

    @NotBlank(message = "Device Type cannot be blank")
    private String deviceType;

    @NotBlank(message = "Device Status cannot be blank")
    private String deviceStatus;
}
