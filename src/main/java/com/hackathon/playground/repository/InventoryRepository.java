package com.hackathon.playground.repository;

import com.hackathon.playground.domain.Inventory;
import com.hackathon.playground.domain.InventoryID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, InventoryID> {
}
