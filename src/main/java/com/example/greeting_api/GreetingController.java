package com.example.greeting_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingController {

        @GetMapping("/api/greet")
        public Map<String, String> greet(@RequestParam(defaultValue = "World") String name) {
            return Map.of("message", "Hello, " + name + "!");
        }

        @GetMapping("/api/health")
        public Map<String, String> health() {
            return Map.of("status", "UP");
        }
}
