package com.hackathon.playground.dto;

import com.hackathon.playground.domain.Emotion;
import com.hackathon.playground.domain.PlayedTotal;
import com.hackathon.playground.domain.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmotionDto {

    private String username;

    private String imgUrl;


}
