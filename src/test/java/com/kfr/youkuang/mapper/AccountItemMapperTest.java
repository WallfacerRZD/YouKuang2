package com.kfr.youkuang.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.sql.Date;


import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountItemMapperTest {
    @Autowired
    private AccountItemMapper accountItemMapper;
    public String test_table = "A_1_2";
    public BigDecimal testMoney = new BigDecimal(10.00);
    public Date testDate = new Date(System.currentTimeMillis());

    @Test
    public void selectAllItems() {
    }

    @Test
    public void insertItem() {
        accountItemMapper.insertItem(test_table,"支出",testMoney,001,testDate,"测试");
    }
}