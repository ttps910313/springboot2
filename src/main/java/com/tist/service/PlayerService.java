package com.tist.service;

import com.tist.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 *    @author Sam
 */
public interface PlayerService extends JpaRepository<Player, Integer> {

    /**
     *     透過角色編號及角色名稱搜尋
     */
    Player findByNoAndName(Integer no, String name);
}
