package com.Nbaproject.basket.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdmDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private boolean isAuthenticated;
}
