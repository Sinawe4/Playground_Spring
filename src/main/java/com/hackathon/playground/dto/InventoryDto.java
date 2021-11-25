package com.hackathon.playground.dto;

import com.hackathon.playground.domain.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryDto {
    private User user;

    private Shop shop;

    public Inventory toEntity(){
        return Inventory.builder()
                .user_idx(this.user)
                .shop_idx(this.shop)
                .build();
    }
}
