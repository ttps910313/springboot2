package com.tist.dao;

import com.tist.domain.Player;

import java.util.List;

/**
 *
 *    @author Sam
 */

public interface PlayerDao {

    /** 創建 table */
    void create();

    /** 插入角色資料 */
    void insert(Player player);

    /** 刪除角色資料 */
    void delete(Integer no);

    /** 更新角色資料 */
    void update(Player player);

    /** 搜尋所有角色資料 */
    List<Player> find();

    /** 搜尋特定角色資料 */
    Player findOne(Player player);
}
