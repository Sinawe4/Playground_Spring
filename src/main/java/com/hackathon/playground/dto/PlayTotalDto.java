package com.hackathon.playground.dto;

import com.hackathon.playground.domain.Game;
import com.hackathon.playground.domain.PlayedTotal;
import com.hackathon.playground.domain.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayTotalDto {
    User user;

    Game game;

    Long score;

    public PlayedTotal toEntity(){
        return PlayedTotal.builder()
                .user_idx(this.user)
                .game_idx(this.game)
                .score(this.score)
                .build();
    }
}
