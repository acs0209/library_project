//package com.office.library.test.member;
//
//import com.office.library.MemberVo;
//import com.office.library.test.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequiredArgsConstructor
//public class MemberController {
//
//    private final MemberService memberService;
//
//    @RequestMapping("/signUp")
//    public String signUp() {
//        return "sign_up";
//    }
//
//    @RequestMapping("/signIn")
//    public String signIn() {
//        return "sign_in";
//    }
//
//    @RequestMapping("/signUpConfirm")
//    public String signUpForm(MemberVo memberVo) {
//        System.out.println("[MemberController] singUpConfirm()");
//
//        System.out.println("m_id: " + memberVo.getM_id());
//        System.out.println("m_pw: " + memberVo.getM_pw());
//        System.out.println("m_mail: " + memberVo.getM_mail());
//        System.out.println("m_phone: " + memberVo.getM_phone());
//
//        memberService.signUpForm(memberVo);
//        return "sign_up_ok";
//    }
//
//    @RequestMapping("/signInConfirm")
//    public String signInConfirm(MemberVo memberVo) {
//        System.out.println("[MemberController] singInConfirm()");
//        MemberVo signedMember = memberService.signInConfirm(memberVo);
//
//        if (signedMember != null) {
//            return "sign_in_ok";
//        } else {
//            return "sign_in_ng";
//        }
//    }
//}
