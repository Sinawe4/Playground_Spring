package com.hackathon.playground.domain;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class PlayTotalID implements Serializable {
    private User user_idx;

    private Game game_idx;
}
