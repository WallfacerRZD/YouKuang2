package com.kfr.db.service;

import com.kfr.db.dao.MemberDao;
import com.kfr.db.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 12:19
 */
@Service
public class MemberService {
    private MemberDao memberDao;

    @Autowired
    public MemberService(MemberDao memberDao) {

        this.memberDao = memberDao;
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public List<Member> selectAllMembers() {
        return memberDao.selectAllMembers();
    }

    public List<Member> selectMemberByName(final String name) {
        return memberDao.selectMemberByName(name);
    }

    public Member selectMemberByStudentID(final String studentID) {
        return memberDao.selectMemberByStudentID(studentID);
    }

    public List<Member> selectMemberByHobby(final String hobby) {
        return memberDao.selectMemberByHobby(hobby);
    }
}
