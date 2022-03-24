package com.fireprohibition.CBomb.dto;

import com.fireprohibition.CBomb.service.ChatService;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class ChatRoom {
    private String roomId; //채팅방 아이디
    private String roomName; //채팅방 이름

    private Set<WebSocketSession> session = new HashSet<>();

    @Builder
    public ChatRoom(String roomId, String roomName) {
        this.roomId = roomId;
        this.roomName =roomName;
    }

    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService) {

    }


}
