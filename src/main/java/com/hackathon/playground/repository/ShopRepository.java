package com.hackathon.playground.repository;

import com.hackathon.playground.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop , Long> {
    Shop findByItemName (String itemName);
}
