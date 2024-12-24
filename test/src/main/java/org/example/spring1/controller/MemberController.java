package org.example.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //스프링에 컨트롤러 등록
//method + url을 and 조건으로 체크하여 함수를 호출
public class MemberController {

    //함수 4개
    //get 요청 3개
    @GetMapping("create")
    public String create(){
        System.out.println("create------");
        return "create";
    }
    @GetMapping("delete")
    public String delete(){
        System.out.println("delete------");
        return "delete";
    }
    @GetMapping("update")
    public String update(){
        System.out.println("update------");
        return "update";
    }

    //post 요청 1개
    @PostMapping("read")
    public String read(){
        System.out.println("read------");
        return "read";
    }
}
