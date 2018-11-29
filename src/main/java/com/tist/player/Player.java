package com.tist.player;

import java.time.LocalDateTime;

public class Player {
    private Integer no;
    private String name;
    private LocalDateTime startDate;
    private Boolean isMale;
    private Double money;
    private Character justCharacter;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Character getJustCharacter() {
        return justCharacter;
    }

    public void setJustCharacter(Character justCharacter) {
        this.justCharacter = justCharacter;
    }
}

/*
CREATE TABLE Player (
 no INT,
 name varchar(255),
 startDate datetime,
 isMale varchar(1),
 money varchar(255),
 justCharacter varchar(255)
 );
 */