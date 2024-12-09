package com.example.user_service.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;
    private String UserId;
    private Date createdAt;

    private String encryptedPwd;
}