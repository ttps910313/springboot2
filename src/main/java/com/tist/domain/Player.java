package com.tist.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

import javax.persistence.*;

/**
 *    Player entity設計
 *    @author Sam
 */
@Data
@Entity
public class Player {

    /**
     * 角色編號
     */
    @Id
    @Column(name = "no_")
    private Integer no;

    /**
     * 角色名稱
     */
    @Column(name = "name_")
    private String name;

    /**
     * 角色創建日期
     */
    @Column(name = "start_date_")
    private Date startDate;

    /**
     * 角色是否為男性
     */
    @Column(name = "is_male_")
    private Boolean isMale;

    /**
     * 角色擁有金錢
     */
    @Column(name = "money_")
    private Double money;

    /**
     * 多個角色擁有多個裝備
     */
    @ManyToMany
    @JoinTable(
            name = "player_equiment",
            joinColumns = {@JoinColumn(name = "player_no_")},
            inverseJoinColumns = {@JoinColumn(name = "equiment_id_")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"player_no_", "equiment_id_"}))
    List<Equipment> equipments;

}