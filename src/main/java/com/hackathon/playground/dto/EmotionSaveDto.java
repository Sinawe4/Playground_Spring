package com.hackathon.playground.dto;

import com.hackathon.playground.domain.Emotion;
import com.hackathon.playground.domain.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmotionSaveDto {

    private User user;

    private String imgUrl;

    public Emotion toEntity(){
        return Emotion.builder()
                .user_idx(this.user)
                .imgUrl(this.imgUrl)
                .build();
    }

}
