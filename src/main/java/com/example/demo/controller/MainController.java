package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class MainController {

    @GetMapping("/test")
    public String test() {
        log.info("test start...");
        return String.valueOf(LocalDateTime.now());
    }

}
