package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TypeMapper {
    @Select("SELECT * FROM type where typeName = #{typeName}")
    Type selectType(@Param("typeName") final String typeName);

    @Select("SELECT * FROM type where typeID = #{tID}")
    Type selecttypeByID(@Param("tID")int tID);

    @Select("SELECT * FROM type")
    List<Type> getAlltype();
}
