package com.tist.repository;

import com.tist.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    /**
     * 使用角色名稱搜尋
     */
    Player findByName(String name);

    /**
     * 使用角色名稱跟角色擁有金錢搜尋
     */
    Player findByNameAndMoney(String name, Double money);
}
