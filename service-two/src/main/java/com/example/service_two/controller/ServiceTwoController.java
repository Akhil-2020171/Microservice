package com.example.service_two.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/service-two")
public class ServiceTwoController {

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> getServiceInfo() {
        Map<String, String> response = Map.of(
                "serviceName", "Service Two",
                "apiUrl", "/service-two/info"
        );
        return ResponseEntity.ok(response);
    }
}
