package com.uphiel.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.uphiel.domain.User;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password) {
        String sqlStr = "SELECT COUNT(*) FROM t_user "
                + " WHERE user_name=? and password=?";
        System.out.println("数据库插入语句：" + sqlStr);
        int length = jdbcTemplate.queryForObject(sqlStr,  new Object[]{userName, password}, Integer.class);
        return length;
    }

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return User
     */
    public User findUserByUserName(final String userName) {
        //根据用户名查询用户的SQL语句
        String sqlStr = "SELECT user_id, user_name, credits "
                + " FROM t_user WHERE user_name=?";
        final User user = new User();
        jdbcTemplate.query(sqlStr, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(userName);
                        user.setUserId(resultSet.getInt("credits"));
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user) {
        String sqlStr = "UPDATE t_user SET last_visit=?, last_ip=?, credits=? "
                + " WHERE user_id=?";
        jdbcTemplate.update(sqlStr, new Object[]{user.getLastVisit(), user.getLastIp(),
                user.getCredits(), user.getPassword()});
    }

}
