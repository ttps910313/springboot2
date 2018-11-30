package com.tist.Player;

import com.tist.player.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerTest {
    @Test
    public void playTest() {

        Player player = new Player();

        player.setNo(1);
        player.setName("sam");
        player.setMoney(1000000.0);
        player.setIsMale(true);
        player.setStartDate(new Date());

        System.out.println(player.toString());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
