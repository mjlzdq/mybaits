package com.jjj.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {

    public static SqlSession createSqlSession() {

        try {
            //获得mybatis的环境配置文件
            String resource = "mybatis-config.xml";
            //以流的形式获取resource
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //获得 SqlSessionFactory 的实例
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            return session;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(createSqlSession().getConfiguration());
    }

}
