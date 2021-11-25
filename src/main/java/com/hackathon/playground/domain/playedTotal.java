package com.hackathon.playground.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class playedTotal implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    @Id
    private User user_idx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gameIdx")
    @Id
    private Game game_idx;

    private Long score;
}
