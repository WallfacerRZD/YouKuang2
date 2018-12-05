package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountMapper {

    @Insert("INSERT INTO account(accountName, userID) values(#{accountName}, #{userID})")
    void  insertOneAccount(@Param("accountName") final String accountName,
                           @Param("userID") final String userID);

    @Select("SELECT * FROM account WHERE accountName = #{accountName}")
    Account selectAccountByAccountName(@Param("accountName") final String accountName);

    @Select("SELECT * FROM account WHERE accountID = #{accountID}")
    Account selectAccountByAccountID(@Param("accountID") final int accountID);

}
