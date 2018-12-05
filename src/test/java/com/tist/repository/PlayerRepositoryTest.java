package com.tist.repository;

import com.tist.domain.Equipment;
import com.tist.domain.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
        player.setName("sam1");

        Equipment eq = new Equipment();
        eq.setId(1);
        eq.setPlayer(player);

        List<Player> players = repository.findByEquipments(eq);
        assertThat(players).isNotNull();
        System.err.println(players);
    }
}
