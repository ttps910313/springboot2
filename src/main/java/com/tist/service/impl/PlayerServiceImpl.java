package com.tist.service.impl;

import com.tist.domain.Player;
import com.tist.repository.PlayerRepository;
import com.tist.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * PlayerService的實作
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Resource
    private PlayerRepository repository;

    /**
     * 插入資料
     * @param player
     */
    public void insert(Player player) {
        repository.save(player);
    }

    /**
     * 刪除資料
     * @param no
     */
    public void delete(Integer no) {
        repository.delete(repository.getOne(no));
    }

    /**
     * 查詢所有資料
     * @return
     */
    public List<Player> findAll() {
        return repository.findAll();
    }

    /**
     * 查詢特地一筆資料
     * @param player
     * @return
     */
    public Player findOne(Player player) {
        Optional<Player> result = repository.findById(player.getNo());
        return result.orElse(null);
    }
}
