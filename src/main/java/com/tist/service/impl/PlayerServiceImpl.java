package com.tist.service.impl;

import com.tist.domain.Player;
import com.tist.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PlayerServiceImpl implements PlayerService {

//    @Resource
//    private PlayerDao dao;

    public void create() {
//        dao.create();
    }

    public void insert(Player player) {
//        dao.insert(player);
    }

    public void delete(Integer no) {
//        dao.delete(no);
    }

    public void update(Player player) {
//        dao.update(player);
    }

    public List<Player> find() {
//        return dao.find();
        return null;
    }

    public Player findOne(Player player) {
//        return dao.findOne(player);
        return null;
    }
}
