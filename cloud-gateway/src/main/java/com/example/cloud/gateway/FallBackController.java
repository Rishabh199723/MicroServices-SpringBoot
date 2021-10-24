package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {
        return "Attention!!! User service is down.";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback() {
        return "Attention!!! Department service is down.";
    }
}
