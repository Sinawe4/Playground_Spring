package com.hackathon.playground.controller;

import com.hackathon.playground.domain.response.CommonResult;
import com.hackathon.playground.domain.response.ResponseService;
import com.hackathon.playground.dto.GameEndDto;
import com.hackathon.playground.dto.ShopDto;
import com.hackathon.playground.repository.ShopRepository;
import com.hackathon.playground.service.GameService;
import com.hackathon.playground.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ShopController {

    private final ResponseService responseService;

    private final ShopService shopService;

    @PostMapping("/buy")
    public CommonResult shopBuy(@RequestBody ShopDto shopDto){
        shopService.shopBuy(shopDto);
        return responseService.getSuccessResult();
    }

}
