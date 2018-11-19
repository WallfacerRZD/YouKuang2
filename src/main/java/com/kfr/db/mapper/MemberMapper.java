package com.kfr.db.mapper;

import com.kfr.db.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 12:13
 */
@Mapper
@Component
public interface MemberMapper {
    @Select("SELECT * FROM team_member")
    List<Member> selectAllMembers();

    @Select("SELECT * FROM team_member WHERE studentID = #{studentID}")
    Member selectMemberByStudentID(final String studentID);

    @Select("SELECT * FROM team_member WHERE name = #{name}")
    List<Member> selectMemberByName(final String name);

    @Select("SELECT * FROM team_member WHERE hobby LIKE CONCAT('%', #{hobby}, '%')")
    List<Member> selectMemberByHobby(final String hobby);
}
