package com.tist.service;


import com.tist.domain.Player;

import java.util.List;

/**
 *
 *    @author Sam
 */
public interface PlayerService {

    /**
     * 插入資料
     * @param player
     */
    void insert(Player player);

    /**
     * 刪除資料
     * @param no
     */
    void delete(Integer no);

    /**
     * 搜尋所有資料
     * @return
     */
    List<Player> findAll();

    /**
     * 搜尋特定資料
     * @param player
     * @return
     */
    Player findOne(Player player);
}
