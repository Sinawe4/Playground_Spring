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
public class Emotion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emotion_idx")
    private Long emotionIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userIdx")
    private User user_idx;

    @Column(name = "img_url")
    @Size(max = 500)
    private String imgUrl;
}
