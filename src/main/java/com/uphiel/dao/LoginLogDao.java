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
        System.out.println("数据库插入语句：" + sqlStr);
        Object[] args = {loginLog.getLoginLogId(), loginLog.getIp(), loginLog.getLoginDate()};
        System.out.println("插入数据：" + args.toString());
        jdbcTemplate.update(sqlStr, args);
    }
}
