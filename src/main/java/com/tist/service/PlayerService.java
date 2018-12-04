package com.tist.service;


import com.tist.domain.Player;

import java.util.List;

/**
 *
 *    @author Sam
 */
public interface PlayerService {

    void insert(Player player);

    void delete(Integer no);

    List<Player> findAll();

    Player findOne(Player player);
}
