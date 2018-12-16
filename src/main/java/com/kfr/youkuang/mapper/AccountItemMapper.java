package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.AccountItem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Mapper
@Component
public interface AccountItemMapper {
    //对数据操作
    //动态创建UID_AID表确定item所属账本
    //对此账本进行CURD
    @Select("SELECT * FROM ${tableName}")
    List<AccountItem> selectAllItems(@Param("tableName") final String tableName);

    @Insert("INSERT INTO ${tableName} (inOut,money,typeID,time,tip)" +
            "values (#{inOut}, #{money}, #{type}, #{time}, #{tip})")
    void insertItem(@Param("tableName") final String tableName,
                    @Param("inOut") final String inOut,
                    @Param("money") final BigDecimal money,
                    @Param("type") final int type,
                    @Param("time") final Date time,
                    @Param("tip") final String tip
    );

    @Update("UPDATE ${tableName} SET inOut=#{inOut}, money=#{money}, typeID= #{type}," +
            "time=#{time}, tip=#{tip} WHERE iNo=#{iNo}")
    void modifyItem(@Param("tableName") final String tableName,
                    @Param("inOut") final String inOut,
                    @Param("money") final BigDecimal money,
                    @Param("type") final int type,
                    @Param("time") final Date time,
                    @Param("tip") final String tip,
                    @Param("iNo") final int iNo);

    @Delete("DELETE FROM ${tableName} WHERE iNo=#{iNo}")
    void deleteItem(@Param("iNo") final int iNo,
                    @Param("tableName") final String tableName);


}
