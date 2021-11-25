package com.hackathon.playground.service;

import com.hackathon.playground.domain.Game;
import com.hackathon.playground.domain.Shop;
import com.hackathon.playground.domain.User;
import com.hackathon.playground.dto.GameEndDto;
import com.hackathon.playground.dto.InventoryDto;
import com.hackathon.playground.dto.PlayTotalDto;
import com.hackathon.playground.dto.ShopDto;
import com.hackathon.playground.repository.InventoryRepository;
import com.hackathon.playground.repository.ShopRepository;
import com.hackathon.playground.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final UserRepository userRepository;
    private final InventoryRepository inventoryRepository;
    private final ShopRepository shopRepository;

    public void shopBuy(ShopDto shopDto)  {
        User user = userRepository.findByUsername(shopDto.getUsername());
        Shop shop = shopRepository.findByItemName(shopDto.getItemName());
        if (user.getGold() >= shop.getItemPrice()){
            user.setGold(user.getGold()-shop.getItemPrice());
            InventoryDto inventoryDto = InventoryDto.builder()
                    .user(user)
                    .shop(shop)
                    .build();
            inventoryRepository.save(inventoryDto.toEntity());
        }
    }
}
