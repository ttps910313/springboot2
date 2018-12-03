package com.tist.repository;

import com.tist.domain.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PlayerRepositoryTest {

    @Resource
    private PlayerRepository repository;

    @Test
    public void crud() {
        Player player = new Player();
        player.setNo(1);
        player.setName("sam");
        repository.save(player);

        player.setNo(2);
        player.setName("sam2");
        player.setMoney(10000.0);
        repository.save(player);

        player.setNo(3);
        player.setName("sam3");
        player.setMoney(30000.0);
        repository.save(player);

        player.setNo(4);
        player.setName("sam4");
        player.setMoney(40000.0);
        repository.save(player);

        player.setNo(5);
        player.setName("sam5");
        player.setMoney(50000.0);
        repository.save(player);

        System.out.println(repository.findByName("sam"));
        System.out.println(repository.findByNameAndMoney("sam5", 50000.0));
        repository.delete(player);

        repository.findAll().forEach(Player -> System.out.println(Player));
    }
}
