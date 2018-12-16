package com.kfr.youkuang.service;

import com.kfr.youkuang.dao.TypeDao;
import com.kfr.youkuang.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    private final TypeDao typeDao;

    @Autowired
    public TypeService(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    public Type selecttypeByName(String typename) {
        return typeDao.selectType(typename);
    }

    public Type selecttypeByID(int tID) {
        return typeDao.selecttypeByID(tID);
    }

    public List<Type> getAlltype() {
        return typeDao.getAlltype();
    }
}
