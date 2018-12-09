package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Account;
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
    User selectUserByUserName(@Param("userName") final String userName);

    @Select("SELECT * FROM account WHERE AcountName = #{AccountName}")
    Account selectAccountByAccountName(@Param("AccountName") final String AccountName);

    @Insert("INSERT INTO youkuang_user(userName, password) values(#{userName}, #{password})")
    void insertOneUser(@Param("userName") final String userName,
                       @Param("password") final String password);

    @Insert("INSERT INTO account(AccountName, UserID) values(#{AccountName}, #{UserID})")
    void  insertOneAccount(@Param("AccountName") final String AccountName,
                           @Param("userName") final String userName);
}
