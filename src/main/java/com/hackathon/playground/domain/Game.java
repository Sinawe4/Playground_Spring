package com.hackathon.playground.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_idx")
    private Long gameIdx;

    @Column(name = "game_name")
    @Size(max = 45)
    private String gameName;
}
