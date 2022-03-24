package com.fireprohibition.CBomb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    //메시지 타입 : 입장, 채팅
    public enum MessageType {
        ENTER, TALK
    }

    private ChatMessage chatMessageType; // 메시지 타입
    private String roomId; //방번호
    private String sender; //메시지 sender
    private String message; //메시지
}
