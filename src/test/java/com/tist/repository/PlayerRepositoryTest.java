package com.tist.repository;

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

        System.out.println(repository.findByName("sam"));
        System.out.println(repository.findByNameAndMoney("sam5", 50000.0));

        repository.findAll().forEach(Player -> System.out.println(Player));
    }
}
