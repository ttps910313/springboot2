package com.tist.service;

import com.tist.domain.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PlayerServiceTest {

    @Resource
    private PlayerService ps;

    @Test
    public void serviceTest() {

        Player player = new Player();
        player.setNo(5);
        player.setName("sam5");
        player.setMoney(5000.0);
        player.setIsMale(true);
        player.setStartDate(null);
        ps.save(player);
        assertThat(ps).isNotNull();

        List<Player> players = ps.findAll();
        players.forEach(System.err::println);
        assertThat(players).isNotNull();

        Player player2 = ps.findByNoAndName(5, "sam5");
        assertThat(player2).isNotNull();
    }
}
