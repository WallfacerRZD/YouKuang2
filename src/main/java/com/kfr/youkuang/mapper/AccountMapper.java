package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

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


    //存疑 动态建表？
    void createNewAccounttable(@Param("tablename")String tablename);


    @Delete("DELETE FROM account WHERE accountID =  #{accountID} AND UserID =  #{UserID}")
    boolean deleteAccount(@Param("accountID")int accountID, @Param("UserID")int UserID);

    //删表
    boolean dropAccounttable(@Param("tablename")String tablename);
}
