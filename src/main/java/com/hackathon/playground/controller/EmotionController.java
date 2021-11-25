package com.hackathon.playground.controller;

import com.hackathon.playground.domain.response.CommonResult;
import com.hackathon.playground.domain.response.ResponseService;
import com.hackathon.playground.dto.EmotionDto;
import com.hackathon.playground.dto.GameEndDto;
import com.hackathon.playground.service.EmotionService;
import com.hackathon.playground.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emotion")
public class EmotionController {
    private final ResponseService responseService;
    private final EmotionService emotionService;

    @PostMapping("/save")
    public CommonResult emotionSave(@RequestBody EmotionDto emotionDto){
        emotionService.emotionSave(emotionDto);
        return responseService.getSuccessResult();
    }
}
