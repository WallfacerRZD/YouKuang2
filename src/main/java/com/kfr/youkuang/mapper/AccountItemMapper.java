package com.kfr.youkuang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AccountItemMapper {
    //对数据操作
    //动态创建UID_AID表确定item所属账本
    //对此账本进行查插删改
}
