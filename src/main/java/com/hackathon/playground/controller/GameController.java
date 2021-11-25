package com.hackathon.playground.controller;

import com.hackathon.playground.domain.response.CommonResult;
import com.hackathon.playground.domain.response.ResponseService;
import com.hackathon.playground.dto.GameEndDto;
import com.hackathon.playground.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class GameController {

    private final ResponseService responseService;
    private final GameService gameService;

    @PostMapping("/end")
    public CommonResult gameEnd(@RequestBody GameEndDto gameEndDto){
        gameService.GameEnd(gameEndDto);
        return responseService.getSuccessResult();
    }
}
