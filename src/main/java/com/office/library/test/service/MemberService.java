//package com.office.library.test.service;
//
//import com.office.library.MemberVo;
//import com.office.library.test.repository.MemberDao;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class MemberService {
//
//    private final MemberDao memberDao;
//
//    public int signUpForm(MemberVo memberVo) {
//        System.out.println("[MemberService] signUpForm");
//
//        System.out.println("m_id: " + memberVo.getM_id());
//        System.out.println("m_pw: " + memberVo.getM_pw());
//        System.out.println("m_mail: " + memberVo.getM_mail());
//        System.out.println("m_phone: " + memberVo.getM_phone());
//
//        memberDao.insertMember(memberVo);
//
//        return 0;
//    }
//
//    public MemberVo signInConfirm(MemberVo memberVo) {
//
//        System.out.println("[MemberService] signInForm");
//
//        MemberVo signedMember = memberDao.selectMember(memberVo);
//        return signedMember;
//    }
//}
