package com.tist.service;

import com.tist.domain.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * PlayerService測試
 * 主要測試新增、查詢、刪除
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PlayerServiceTest {

    @Resource
    private PlayerService ps;

    @Test
    public void playerServiceTest() {

        /**
                 * 新增資料測試
                 */
        Player player = new Player();
        player.setNo(5);
        player.setName("sam5");
        player.setMoney(5000.0);
        player.setIsMale(true);
        player.setStartDate(null);
        ps.insert(player);
        assertThat(ps).isNotNull();

        /**
         * 查詢資料測試
         */
        List<Player> players = ps.findAll();
        players.forEach(System.err::println);
        assertThat(players).isNotNull();

        /**
         * 刪除資料測試
         */
        ps.delete(5);
        Player disappear = ps.findOne(player);
        assertThat(disappear).isNull();

    }
}