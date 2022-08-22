package com.jjj.test;

import com.jjj.entity.User;
import com.jjj.mapper.UserMapper;
import com.jjj.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByPwd("1234");
        User user1 = userMapper.queryUserByName("zhangsan");
        System.out.println(user.getUserAge());
        System.out.println(user1.getUserId());



    }
}
