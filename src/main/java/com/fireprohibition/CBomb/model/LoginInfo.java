package com.fireprohibition.CBomb.model;
import lombok.Builder;
import lombok.Getter;

//로그인 정보 전달
@Getter
public class LoginInfo {
    private String name;
    private String token;

    @Builder
    public LoginInfo(String name, String token) {
        this.name = name;
        this.token = token;
    }
}