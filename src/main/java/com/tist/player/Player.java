package com.tist.player;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class Player {
    private Integer no;
    private String name;
    private Date startDate;
    private Boolean isMale;
    private Double money;
}

/*
CREATE TABLE Player (
 NO_ INT, (PK)
 NAME_ varchar(255),
 STARTDATE_ datetime,
 ISMALE_ varchar(1),
 MONEY_ varchar(255),
 JUSTCHATACTOR varchar(255)
 );
 */