package com.uphiel.dao;

import com.uphiel.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/5/10.
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sqlStr = "INSERT INTO t_login_log(user_id, ip, login_datetime) " +
                " VALUES(?,?,?)";
        System.out.println("1：" + loginLog.getLoginLogId());
        System.out.println("2：" + loginLog.getIp());
        System.out.println("3：" + loginLog.getLoginDate());
        Object[] args = {5, loginLog.getIp(), loginLog.getLoginDate()};
        System.out.println("插入数据：" + args[0]);
        System.out.println("插入数据：" + args[1]);
        System.out.println("插入数据：" + args[2]);
        jdbcTemplate.update(sqlStr, args);
    }
}

