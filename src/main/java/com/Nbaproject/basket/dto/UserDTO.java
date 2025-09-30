package com.Nbaproject.basket.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;
    private String password;
    private String email;
    private boolean isAuthenticated;
}
