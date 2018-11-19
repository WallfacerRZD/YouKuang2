package com.kfr.db.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 13:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    public void selectAllMembers() {
        System.out.println(memberService.selectAllMembers());
    }

    @Test
    public void selectMemberByName() {
        System.out.println(memberService.selectMemberByName("冉哲东"));
    }

    @Test
    public void selectMemberByStudentID() {
        System.out.println(memberService.selectMemberByStudentID("2016141462307"));
    }

    @Test
    public void selectMemberByHobby() {
        System.out.println(memberService.selectMemberByHobby("吃"));
    }
}