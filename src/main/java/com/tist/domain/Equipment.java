package com.tist.domain;

import lombok.Data;

import javax.persistence.*;

/**
 *    Equipment entity設計
 *    @author Sam
 */
@Data
@Entity
public class Equipment {
    /**
     * 裝備ID
     */
    @Id
    @Column(name = "id_")
    private Integer id;

    /**
     * 裝備顏色
     */
    @Column(name = "color_")
    private String color;

    /**
     * 裝備攻擊
     */
    @Column(name = "attack_")
    private Integer attack;

    /**
     * 裝備防禦
     */
    @Column(name = "defense_")
    private Integer defense;

    /**
     * 裝備種類
     */
    @Column(name = "kind_")
    private String kind;

    /**
         * 多個裝備屬於一個角色
         */
    @ManyToOne
    @JoinColumn(name = "player_no_")
    private Player player;
}
