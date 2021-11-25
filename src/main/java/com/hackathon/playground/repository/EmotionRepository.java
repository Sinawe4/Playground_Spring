package com.hackathon.playground.repository;

import com.hackathon.playground.domain.Emotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionRepository extends JpaRepository<Emotion,Long> {
}
