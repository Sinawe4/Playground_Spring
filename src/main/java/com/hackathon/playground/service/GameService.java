package com.hackathon.playground.service;

import com.hackathon.playground.domain.Game;
import com.hackathon.playground.domain.User;
import com.hackathon.playground.dto.GameEndDto;
import com.hackathon.playground.dto.PlayTotalDto;
import com.hackathon.playground.repository.GameRepository;
import com.hackathon.playground.repository.PlayedTotalRepository;
import com.hackathon.playground.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;
    private final UserRepository userRepository;
    private final PlayedTotalRepository playedTotalRepository;

    public void GameEnd(GameEndDto gameEndDto){
        Game game = gameRepository.findByGameName(gameEndDto.getGameName());
        User user = userRepository.findByUsername(gameEndDto.getUsername());
        PlayTotalDto playTotalDto = PlayTotalDto.builder()
                .game(game)
                .user(user)
                .score(gameEndDto.getScore())
                .build();
        playedTotalRepository.save(playTotalDto.toEntity());

        if (gameEndDto.getRank() > 0){
            switch (gameEndDto.getRank()){
                case 1 : user.setGold(user.getGold()+10000);
                    break;
                case 2 : user.setGold(user.getGold()+7000);
                    break;
                case 3 : user.setGold(user.getGold()+5000);
                    break;
            }
        }
        else{
            if (gameEndDto.getScore()==10000){
                user.setGold(user.getGold()+6000);
            }
            else{
                user.setGold(user.getGold()+4000);
            }
        }
    }
}
