package com.tist.dao.impl;

import com.tist.dao.PlayerDao;
import com.tist.player.Player;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class PlayerDaoImpl implements PlayerDao {

    @Resource
    private JdbcTemplate template;

    @Override
    public void create() {
        template.execute("CREATE TABLE Player (NO_ INT PRIMARY KEY, NAME_ varchar(255), STARTDATE_ datetime, ISMALE_ varchar(5), MONEY_ varchar(255))");
    }

    @Override
    public void insert(Player player) {
        template.update("INSERT INTO Player VALUES (?, ?, ?, ?, ?)", new Object[]{player.getNo(), player.getName(), player.getStartDate(), player.getIsMale(), player.getMoney()});
    }

    @Override
    public void delete(Integer no) {
        template.update("DELETE FROM Player WHERE NO_ = ?", new Object[]{no});
    }

    @Override
    public void update(Player player) {
        template.update("UPDATE Player SET NAME_ = ?,STARTDATE_ = ?,ISMALE_ = ?,MONEY_ = ?WHERE NO_ = ?", new Object[]{player.getName(),
                                                player.getStartDate(),
                                                player.getIsMale(),
                                                player.getMoney(),
                                                player.getNo()});
    }

    @Override
    public List<Player> find() {
        return template.query("SELECT * FROM Player", new PlayerMapper());
    }

    @Override
    public Player findOne(Player player) {
        return (Player)template.queryForObject("SELECT * FROM Player WHERE NO_ = ?", new Object[]{player.getNo()}, new PlayerMapper());
    }

    class PlayerMapper implements RowMapper {
        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Player player = new Player();
            player.setNo(resultSet.getInt("no_"));
            player.setName(resultSet.getString("name_"));
            player.setStartDate(resultSet.getDate("startDate_"));
            player.setIsMale(resultSet.getBoolean("isMale_"));
            player.setMoney(resultSet.getDouble("money_"));
            return player;
        }
    }
}