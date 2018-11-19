package com.kfr.db.dao;

import com.kfr.db.entity.Member;
import com.kfr.db.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 12:12
 */
@Repository
public class MemberDao {
    private MemberMapper memberMapper;

    @Autowired
    public MemberDao(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public MemberMapper getMemberMapper() {
        return memberMapper;
    }

    public void setMemberMapper(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<Member> selectAllMembers() {
        return memberMapper.selectAllMembers();
    }

    public Member selectMemberByStudentID(final String studentID) {
        return memberMapper.selectMemberByStudentID(studentID);
    }

    public List<Member> selectMemberByName(final String name) {
        return memberMapper.selectMemberByName(name);
    }

    public List<Member> selectMemberByHobby(final String hobby) {
        return memberMapper.selectMemberByHobby(hobby);
    }
}
