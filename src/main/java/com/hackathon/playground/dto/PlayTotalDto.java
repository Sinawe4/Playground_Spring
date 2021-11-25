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
    private User user;

    private Game game;

    private Long score;

    public PlayedTotal toEntity(){
        return PlayedTotal.builder()
                .user_idx(this.user)
                .game_idx(this.game)
                .score(this.score)
                .build();
    }
}
