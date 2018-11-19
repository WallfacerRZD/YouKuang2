package com.kfr.db.action;

import com.kfr.db.entity.Member;
import com.kfr.db.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2018/11/9 13:44
 */
@RestController
public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/all")
    public List<Member> getAllMembers() {
        return memberService.selectAllMembers();
    }

    @GetMapping("/member/id/{id}")
    public Member getMemberByStudentID(@PathVariable("id") final String id) {
        return memberService.selectMemberByStudentID(id);
    }

    @GetMapping("/member/name/{name}")
    public List<Member> getMemberByName(@PathVariable("name") final String name) {
        return memberService.selectMemberByName(name);
    }

    @GetMapping("/member/hobby/{hobby}")
    public List<Member> getMemberByHobby(@PathVariable("hobby") final String hobby) {
        return memberService.selectMemberByHobby(hobby);
    }

}
