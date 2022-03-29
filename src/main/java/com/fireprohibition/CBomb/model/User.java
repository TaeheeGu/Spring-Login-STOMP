package com.fireprohibition.CBomb.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {
    private String name;
    private String token;

    @Builder
    public User(String name, String token) {
        this.name = name;
        this.token = token;
    }
}
