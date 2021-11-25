package com.hackathon.playground.service;

import com.hackathon.playground.domain.User;
import com.hackathon.playground.dto.EmotionDto;
import com.hackathon.playground.dto.EmotionSaveDto;
import com.hackathon.playground.repository.EmotionRepository;
import com.hackathon.playground.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmotionService {

    private final EmotionRepository emotionRepository;
    private final UserRepository userRepository;

    public void emotionSave(EmotionDto emotionDto){
        User user = userRepository.findByUsername(emotionDto.getUsername());
        EmotionSaveDto emotionSaveDto = EmotionSaveDto.builder()
                .user(user)
                .imgUrl(emotionDto.getImgUrl())
                .build();

        emotionRepository.save(emotionSaveDto.toEntity());
    }
}
