package com.fireprohibition.CBomb.controller;

import com.fireprohibition.CBomb.dto.ChatRoom;
import com.fireprohibition.CBomb.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public ChatRoom create(@RequestParam String roomName) {
        return chatService.createRoom(roomName);
    }

    @GetMapping
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
}
