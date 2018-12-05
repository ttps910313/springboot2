package com.tist.repository;

import com.tist.domain.Equipment;
import com.tist.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * EquipmentRepository
 */
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    Equipment findByPlayer(List<Player> players);
}
