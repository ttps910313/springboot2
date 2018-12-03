package com.tist.service;

import com.tist.domain.Player;

import java.util.List;

public interface PlayerService {
    void create();
    void insert(Player player);
    void delete(Integer no);
    void update(Player player);
    List<Player> find();
    Player findOne(Player player);
}
