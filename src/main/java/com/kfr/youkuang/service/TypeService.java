package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.TypeDao;
import com.kfr.youkuang.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;

public class TypeService {
    private final TypeDao typeDao;

    @Autowired
    public TypeService(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    public Type selecttype(String typename){
        return typeDao.selectType(typename);
    }

}
