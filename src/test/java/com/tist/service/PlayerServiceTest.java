package com.tist.service;

import com.tist.domain.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PlayerServiceTest {

    @Resource
    private PlayerService ps;

    @Test
    public void serviceTest() {
        ps.create();

        Player player = new Player();
        player.setNo(0);
        player.setName("sam");
        player.setIsMale(true);
        player.setMoney(1000000000.0);
        player.setStartDate(new Date());

        ps.insert(player);
        player.setNo(2);
        ps.insert(player);
        System.err.println(ps.find());

        Player target = new Player();
        target.setNo(0);
        target.setName("11111111");
        ps.update(target);
        System.err.println(target);

        ps.delete(2);

        assertThat(ps.find()).isNotNull();
        System.err.println(ps.find());
        //assertThat(ps.find()).isNotNull();

        Player targetTwo = ps.findOne(target);
        assertThat(targetTwo).isNotNull();
        System.err.println(targetTwo);
    }
}
