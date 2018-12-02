package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 12:13
 */
@Mapper
@Component
public interface UserMapper {
    @Select("SELECT * FROM youkuang_user where userName = #{userName}")
    User selectUserByUserName(@Param("userName") final String userName);//password?

    @Insert("INSERT INTO youkuang_user(userID, userName, password) values(#{userID}, #{userName}, #{password})")
    void insertOneUser(@Param("userID") final int userID,
                       @Param("userName") final String userName,
                       @Param("password") final String password);
}
