package com.Nbaproject.basket.dto;

import com.Nbaproject.basket.entity.Team;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDTO {

    private Long id;
    private String name;
    private Team team;
    private int points;
    private int rebounds;
    private int assists;
    private int steals;
    private int blocks;
}
