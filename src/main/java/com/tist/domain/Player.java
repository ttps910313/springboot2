package com.tist.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 *    @author Sam
 */
@Data
@Entity
public class Player {

    /** 角色編號 */
    @Id
    @Column(name = "no_")
    private Integer no;

    /** 角色名字 */
    @Column(name = "name_")
    private String name;

    /** 角色創建日期 */
    @Column(name = "startDate_")
    private Date startDate;

    /** 角色是否為男性 */
    @Column(name = "isMale_")
    private Boolean isMale;

    /** 角色擁有金錢 */
    @Column(name = "money_")
    private Double money;
}