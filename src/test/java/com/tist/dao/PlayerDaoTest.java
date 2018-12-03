package com.tist.dao;

import com.tist.domain.Player;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
public class PlayerDaoTest {
    @Resource
    private PlayerDao dao;

    @Test
    public void crud() {
        dao.create();
        Player player = new Player();
        player.setNo(0);
        player.setName("sam");
        player.setIsMale(true);
        player.setMoney(1000000000.0);
        player.setStartDate(new Date());

        dao.insert(player);
        player.setNo(2);
        dao.insert(player);
        System.err.println(dao.find());

        Player target = new Player();
        target.setNo(0);
        target.setName("11111111");
        dao.update(target);
        System.err.println(target);

        dao.delete(2);

        assertThat(dao.find()).isNotNull();
        System.err.println(dao.find());
        //assertThat(dao.find()).isNotNull();

        Player targetTwo = dao.findOne(target);
        assertThat(targetTwo).isNotNull();
        System.err.println(targetTwo);

    }
}
