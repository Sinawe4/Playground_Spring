package com.hackathon.playground.repository;

import com.hackathon.playground.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
    Game findByGameName (String gameName);
}
