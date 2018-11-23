package com.imooc.user.mapper;

import com.imooc.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, username, password," +
            "realname, mobile, email from pe_user where id =#{id}")
    UserInfo getUserById(@Param("id")int id);

    @Select("select id, username, password," +
            "realname, mobile, email from pe_user where username =#{username}")
    UserInfo getUserByName(@Param("username")String username);

    @Insert("insert into pe_user (username, password, realname, mobile, email) " +
            "values (#{user.username}, #{user.password}, #{user.realName}, #{user.mobile}, #{user.email})")
    void registerUser(@Param("user") UserInfo userInfo);

    @Select("select u.id, u.username, u.password, u.realname, u.mobile, u.email, " +
            "t.info, t.stars " +
            "from pe_user as u, pe_teacher as t " +
            "where u.id = #{id} " +
            "and u.id = t.user_id ")
    UserInfo getTeacherById(@Param("id") int id);
}
