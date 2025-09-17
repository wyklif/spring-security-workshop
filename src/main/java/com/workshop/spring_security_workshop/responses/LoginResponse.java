package com.workshop.spring_security_workshop.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String token;
    private Long expiresIn;

    public LoginResponse(String token, Long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }
}
