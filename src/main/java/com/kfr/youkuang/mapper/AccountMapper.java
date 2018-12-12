package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface AccountMapper {

    @Insert("INSERT INTO account(accountID, userID) values(#{accountID}, #{userID})")
    void  insertOneAccount(@Param("accountID") final int accountID,
                           @Param("userID") final int userID);

    @Select("SELECT * FROM account WHERE accountName = #{accountName}")
    Account selectAccountByAccountName(@Param("accountName") final String accountName);

    @Select("SELECT * FROM account WHERE accountID = #{accountID}")
    Account selectAccountByAccountID(@Param("accountID") final int accountID);

    @Select("SELECT accountID FROM account WHERE UserID = #{UserID}")
    List getaccountsIDbyUserID(@Param("UserID") final int UserID);


    //存疑 动态建表？
    void createNewAccountTable(@Param("tableName")String tableName);

    //删account的表里面一行的记录
    @Delete("DELETE FROM account WHERE accountID =  #{accountID} AND UserID =  #{UserID}")
    boolean deleteAccount(@Param("accountID")int accountID, @Param("UserID")int UserID);

    //删表
    boolean dropAccountTable(@Param("tableName")String tableName);
}
