package com.jjj.mapper;

import com.jjj.entity.User;


public interface UserMapper {
    public User queryUserByName(String userName);
    public User queryUserByPwd(String userPwd);
    /*
    @Select("select * from tb_user where userPwd = #{userPwd}")
    User queryUserByPwd (String userPwd);
     */


}
