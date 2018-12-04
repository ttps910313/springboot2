package com.tist.service.impl;

import com.tist.domain.Player;
import com.tist.repository.PlayerRepository;
import com.tist.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Resource
    private PlayerRepository repository;


    public void insert(Player player) {
        repository.save(player);
    }

    public void delete(Integer no) {
        repository.delete(repository.getOne(no));
    }

    public List<Player> findAll() {
        return repository.findAll();
    }

    public Player findOne(Player player) {
        return repository.getOne(player.getNo());
    }
}
