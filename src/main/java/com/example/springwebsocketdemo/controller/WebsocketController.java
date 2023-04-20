package com.example.springwebsocketdemo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@Slf4j
@RequiredArgsConstructor
public class WebsocketController {
    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/add-product")
    public void addProduct(@Payload List<String> names) {
        simpMessagingTemplate.convertAndSend("/topic/sort-names", names.stream().sorted().toList());
    }
}
