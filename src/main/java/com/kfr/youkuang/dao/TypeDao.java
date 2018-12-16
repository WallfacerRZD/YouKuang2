package com.kfr.youkuang.dao;

import com.kfr.youkuang.entity.Type;
import com.kfr.youkuang.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypeDao {
    private final TypeMapper typeMapper;

    @Autowired
    public TypeDao(TypeMapper typeMapper) {
        this.typeMapper = typeMapper;
    }

    public Type selectType(final String typename){
        return typeMapper.selectType(typename);
    }

    public Type selecttypeByID(int tID) {
        return typeMapper.selecttypeByID(tID);
    }

    public List<Type> getAlltype() {
        return typeMapper.getAlltype();
    }


}
