package com.tist.repository;


import com.tist.domain.Equipment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *     EquipmentRepository測試
 *     主要測試新增、查詢、刪除
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class EquipmentRepositoryTest {

    @Resource
    private EquipmentRepository repository;
    
    @Test
    public void test() {
        /**
                * 新增功能測試
                */
        Equipment eq = new Equipment();
        eq.setId(1);
        eq.setAttack(100);
        repository.save(eq);
        assertThat(repository).isNotNull();

        /**
                * 查詢功能測試
                */
        Optional<Equipment> result = repository.findById(1);
        assertThat(result).isNotNull();

        /**
                 * 刪除功能測試
                 */
        repository.delete(eq);
        Optional<Equipment> result2 = repository.findById(1);
        assertThat(result2.orElse(null)).isNull();

    }
}