package com.hackathon.playground.repository;

import com.hackathon.playground.domain.PlayTotalID;
import com.hackathon.playground.domain.PlayedTotal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayedTotalRepository extends JpaRepository<PlayedTotal, PlayTotalID> {
}
