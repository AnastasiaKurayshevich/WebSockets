package com.nameless_devs.webSockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;

public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public String sendMessage(@Payload String message) {
        return message;
    }
}
