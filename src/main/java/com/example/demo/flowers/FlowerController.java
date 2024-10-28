package com.example.demo.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    @GetMapping("/status")
    public String getStatus() {
        return "Flower service is up and running!";
    }
}
