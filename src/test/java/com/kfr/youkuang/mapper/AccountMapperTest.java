package com.kfr.youkuang.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void insertOneAccount() {
    }

    @Test
    public void selectAccountByAccountName() {
    }

    @Test
    public void selectAccountByAccountID() {
    }

    @Test
    public void getaccountsIDbyUserID() {
    }

    @Test
    public void createNewAccountTable() {
        accountMapper.createNewAccountTable("a01_001");
    }

    @Test
    public void deleteAccount() {
    }

    @Test
    public void dropAccounttable() {
    }
}