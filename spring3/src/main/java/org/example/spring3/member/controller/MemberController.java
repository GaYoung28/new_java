package org.example.spring3.member.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j //logback 객체가 생성
//slf4j log = new LogBack();
@Controller
@RequestMapping("member")

//localhost:8888/member
public class MemberController {

    @GetMapping("member")
    //localhost:8888/member/member
    public String member(){
        log.info("member-------------");
        return "member/member";
        //templates 아래 member 폴더를 찾고
        //member폴더/member.html을 찾습니다.!
    }
}
