package com.tist.service.impl;

import com.tist.domain.Player;
import com.tist.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

//    @Resource
//    private PlayerDao dao;

    @Override
    public void create() {
//        dao.create();
    }

    @Override
    public void insert(Player player) {
//        dao.insert(player);
    }

    @Override
    public void delete(Integer no) {
//        dao.delete(no);
    }

    @Override
    public void update(Player player) {
//        dao.update(player);
    }

    @Override
    public List<Player> find() {
//        return dao.find();
        return null;
    }

    @Override
    public Player findOne(Player player) {
//        return dao.findOne(player);
        return null;
    }
}
