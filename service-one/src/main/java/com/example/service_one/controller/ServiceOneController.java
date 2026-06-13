package com.example.service_one.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/service-one")
public class ServiceOneController {

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> getServiceInfo() {
        Map<String, String> response = Map.of(
                "serviceName", "Service One",
                "apiUrl", "/service-one/info"
        );
        return ResponseEntity.ok(response);
    }
}
