package com.hackathon.playground.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class PlayTotalID implements Serializable {
    private Long user_idx;

    private Long game_idx;
}
