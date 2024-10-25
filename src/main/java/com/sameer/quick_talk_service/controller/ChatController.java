package com.sameer.quick_talk_service.controller;

import com.sameer.quick_talk_service.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;  // Simply return the message to all clients
    }
}
