package com.hackathon.playground.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameEndDto {
    private String username;

    private String gameName;

    private Long score;

    private Long rank;
}
